<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mt-3 mb-3">Welcome To Product App</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products}" var="p">
							<tr>
								<th scope="row">${p.id }</th>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td class="font-weight-bold">&#x20B9; ${p.price }/-</td>
								<td>
									<a href="delete_product/${p.id}">
										<i class="fas fa-trash text-danger" style="font-size:22px;" ></i>
									</a>
									<a href="update_product/${p.id}">
										<i class="fas fa-pen-nib text-primary pl-3" style="font-size:22px;"></i>
									</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="container text-center">
					<a href="add_product" class="btn btn-outline-success">Add product</a>
				</div>
			</div>
		</div>

	</div>

</body>
</html>