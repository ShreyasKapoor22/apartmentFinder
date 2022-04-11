


<div class="container">
	<h1>Register</h1>

	<form:form action="addUser" cssClass="form-horizontal" method="post" modelAttribute="user">

		<fieldset class="form-group">
			<form:label path="name" class="col-md-2 control-label">Name: </form:label>
			<div class="col-md-5">
				<form:input path="name" class="form-control" type="text"
							name="name" placeholder="Enter your name" id="name" />
				<form:errors path="name" cssClass="text-warning" />
			</div>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="userName" class="col-md-2 control-label">User Name: </form:label>
			<div class="col-md-5">
				<form:input path="userName" class="form-control" type="text"
					name="userName" placeholder="Enter UserName" id="userName" />
				<form:errors path="userName" cssClass="text-warning" />
			</div>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="password" class="col-md-2 control-label">Password: </form:label>
			<div class="col-md-5">
				<form:input path="password" class="form-control" type="password"
					name="password" placeholder="Enter password" id="password" />
				<form:errors path="password" cssClass="text-warning" />
			</div>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="emailAddress" class="col-md-2 control-label">Email Address: </form:label>
			<div class="col-md-5">
				<form:input path="emailAddress" class="form-control" type="text"
							name="emailAddress" placeholder="Enter valid Cu Email " id="emailAddress" />
				<form:errors path="emailAddress" cssClass="text-warning" />
			</div>
		</fieldset>


		<fieldset class="form-group">
			<form:label path="contactNo" class="col-md-2 control-label"> Phone number: </form:label>
			<div class="col-md-5">
				<form:input path="contactNo" class="form-control" type="text"
					name="phone" placeholder="Enter your phone number" id="phone" />
				<form:errors path="contactNo" cssClass="text-warning" />
			</div>
		</fieldset>




		<input class="btn btn-success" type="submit" value="Register" />
	</form:form>

</div>