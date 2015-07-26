<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<link type="text/css" href="<%=request.getContextPath() %>/css/bootstrap.css" rel="stylesheet"/>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<fieldset>
				<legend>User Login</legend>
				<form class="form-horizontal" method="post" action='add' name="employeeForm" id="employeeForm">
					<div class="control-group">
						<label class="control-label">Name</label>
						<div class="controls">
							<input type="text" name="name" id="name" title="Name" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Email</label>
						<div class="controls">
							<input type="text" name="email" id="email" title="Email" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Phone Number</label>
						<div class="controls">
							<input type="text" name="phone" id="phone" title="Phone Number" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Address</label>
						<div class="controls">
							<input type="text" name="address" id="address" title="Email" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Password</label>
						<div class="controls">
							<input type="password" name="password" id="password" title="Password" value="">
						</div>
					</div>
					<div class="form-actions">
						<button type="submit" class="btn btn-success">Submit</button>
						<button type="button" class="btn">Cancel</button>
					</div>
				</form>
				</fieldset>
			</div>
		</div>
	</div>		
</body>
</html>