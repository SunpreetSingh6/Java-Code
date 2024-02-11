<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body style="background: #e2e2e2;">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-7 offset-md-2">
				<div class="card">
					<div class="card-body">
						<form action="handle" method="post">
							<h3 class="text-center">Complex Form</h3>
							<div class="alert alert-danger" role="alert">
								<form:errors path="user.*" />
							</div>
							<div class="form-group">
								<label for="exampleFormControlInput1">Name</label> <input
									type="text" class="form-control" id="exampleFormControlInput1"
									placeholder="Enter Name" name="name">
							</div>
							<div class="form-group">
								<label for="exampleFormControlInput1">Id</label> <input
									type="text" class="form-control" id="exampleFormControlInput1"
									placeholder="Enter Id" name="id">
							</div>
							<div class="form-group">
								<label for="exampleFormControlInput1">Email address</label> <input
									type="email" class="form-control" id="exampleFormControlInput1"
									placeholder="name@example.com" name="email">
							</div>
							<div class="form-group">
								<label for="exampleFormControlInput1">Password</label> <input
									type="password" class="form-control"
									id="exampleFormControlInput1" placeholder="password"
									name="password">
							</div>
							<div class="form-group">
								<label for="exampleFormControlInput1">Date of birth</label> <input
									type="text" class="form-control" id="exampleFormControlInput1"
									placeholder="dd/MM/yyyy" name="dob">
							</div>
							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										value="Male" id="inlineradio1"> <label
										class="form-check-label" for="inlineradio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										value="Female" id="inlineradio2"> <label
										class="form-check-label" for="inlineradio2">Female</label>
								</div>
							</div>
							<label >Address</label>
							<div class="card mb-2">
								<div class="card-body">
									<div class="form-group">
										<label for="exampleFormControlInput1">City</label> <input
											type="text" class="form-control"
											id="exampleFormControlInput1" placeholder="Enter City"
											name="address.city">
									</div>
									<div class="form-group">
										<label for="exampleFormControlInput1">State</label> <input
											type="text" class="form-control"
											id="exampleFormControlInput1" placeholder="Enter State"
											name="address.state">
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="exampleFormControlSelect1">Select Courses</label> <select
									class="form-control" id="exampleFormControlSelect1"
									name="courses" multiple>
									<option>Java</option>
									<option>C++</option>
									<option>Python</option>
									<option>Javascript</option>
									<option>Php</option>
								</select>
							</div>
							<div class="form-group">
								<label for="exampleFormControlTextarea1">Add some
									comments</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									rows="3" name="comments"></textarea>
							</div>
							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>