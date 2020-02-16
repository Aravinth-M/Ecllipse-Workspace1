
<!-- html -->
<div class="container contact-container">
	<!-- <div class="container"> -->
	<div class="row">
		<div class="col-lg-12">
			<h4 class="text-center">Contact Me</h4>
		</div>
	</div>
	<div class="row">

		<div class="col-lg-offset-5 col-lg-5" id="panel">
			<h4>Get In Touch</h4>

			<form>

				<div class="group">
					<input type="text" required> <span class="highlight"></span>
					<span class="bar"></span> <label>Name</label>
				</div>

				<div class="group">
					<input type="text" required> <span class="highlight"></span>
					<span class="bar"></span> <label>Email</label>
				</div>

				<div class="group">
					<input type="text" required> <span class="highlight"></span>
					<span class="bar"></span> <label>Mobile No</label>
				</div>

				<div class="group">
					<input type="text" required> <span class="highlight"></span>
					<span class="bar"></span> <label>Web Site</label>
				</div>

				<div class="group">
					<input type="text" required> <span class="highlight"></span>
					<span class="bar"></span> <label>Message</label>
				</div>
				<div class="group">
					<center>
						<button type="submit" class="btn btn-submit">
							Submit <span class="glyphicon glyphicon-send"></span>
						</button>
					</center>
				</div>
			</form>

		</div>
		<div class="col-lg-offset-7 col-lg-7">
			<div class="container">
				<img class="addrerss-img" alt="address"
					src="RightAtHome/img/address.png">
			</div>

		</div>

	</div>

</div>



<!-- css -->
<style type="text/css">
* {
	box-sizing: border-box;
}

h2 {
	text-align: center;
	margin-bottom: 50px;
	color: #4d4d4d;
}

.group {
	position: relative;
	margin-bottom: 35px;
}

input {
	font-size: 18px;
	padding: 5px 10px 10px 5px;
	display: block;
	width: 100%;
	border: none;
	border-bottom: 1px solid #4d4d4d;
	background: transparent;
	color: #4d4d4d;
}

input:focus {
	outline: none;
}

label {
	color: #4d4d4d4;
	font-size: 18px;
	font-weight: normal;
	position: absolute;
	pointer-events: none;
	left: 5px;
	top: 10px;
	transition: 0.2s ease all;
	-moz-transition: 0.2s ease all;
	-webkit-transition: 0.2s ease all;
}

input:focus ~ label, input:valid ~ label {
	top: -20px;
	font-size: 14px;
	color: #4d4d4d;
}

.bar {
	position: relative;
	display: block;
	width: 100%;
}

.bar:before, .bar:after {
	content: '';
	height: 2px;
	width: 0;
	bottom: 1px;
	position: absolute;
	background: #4d4d4d;
	transition: 0.2s ease all;
	-moz-transition: 0.2s ease all;
	-webkit-transition: 0.2s ease all;
}

.bar:before {
	left: 50%;
}

.bar:after {
	right: 50%;
}

input:focus ~ .bar:before, input:focus ~ .bar:after {
	width: 50%;
}

.highlight {
	position: absolute;
	height: 60%;
	width: 100px;
	top: 25%;
	left: 0;
	pointer-events: none;
	opacity: 0.5;
}


input:focus ~ .highlight {
	-webkit-animation: inputHighlighter 0.3s ease;
	-moz-animation: inputHighlighter 0.3s ease;
	animation: inputHighlighter 0.3s ease;
}


@
-webkit-keyframes inputHighlighter {from { background:#fff;
	
}

to {
	width: 0;
	background: transparent;
}

}
@
-moz-keyframes inputHighlighter {from { background:#fff;
	
}

to {
	width: 0;
	background: transparent;
}

}
@
keyframes inputHighlighter {from { background:#fff;
	
}

to {
	width: 0;
	background: transparent;
}

}
#panel {
	border: 1px solid rgb(200, 200, 200);
	box-shadow: rgba(0, 0, 0, 0.1) 0px 5px 5px 2px;
	border-radius: 4px;
	top: 20px;
	height: 485px;
}

.btn-submit {
	background-color: #52288e;
	color: #fff;
	border-color: #52288e;
}

.addrerss-img {
	height: 765px;
	width: 885px;
	margin-top: 20px;
}

.contact-container {
	margin-top: 100px;
	margin-left: 100px;
	margin-right: 100px;
}
</style>