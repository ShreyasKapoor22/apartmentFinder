package ApartmentFinder.Config;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Properties;

public class NLPPipeline {

    static StanfordCoreNLP pipeline;
    public static void init()
    {
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
        pipeline = new StanfordCoreNLP(props);
    }
    public static double estimatingSentiment(String text)
    {
        String sentimentName;
        ArrayList<Integer> sentimentValue = new ArrayList<>();
        ArrayList<String> parts = new ArrayList<>(Arrays.asList(text.split("\\.")));
        for(String sentencePart : parts){
            Annotation annotation = pipeline.process(sentencePart);
            CoreMap sentence = annotation.get(CoreAnnotations.SentencesAnnotation.class).get(0);
            Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
            int sentimentInt = RNNCoreAnnotations.getPredictedClass(tree);
            sentimentName = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
            sentimentValue.add(sentimentInt);
            System.out.println(sentimentName + "\t" + sentimentInt + "\t" + sentence);

        }

        OptionalDouble finalReviewValue = sentimentValue.stream().mapToDouble(a -> a).average();
        return finalReviewValue.isPresent() ? finalReviewValue.getAsDouble() :0;


    }
}
