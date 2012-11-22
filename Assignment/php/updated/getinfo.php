<?php 
	require_once("data.php");
	//Removed one closed bracket.
	$arrayUrl = split('/', $_SERVER[REQUEST_URI]);
	//Update the array index to retrieve the id.
	$id = $arrayUrl[2];	
	
	//Used the property data. It should be done better if the request parameter
	//identify the requested data as HDB or Condo
	$data = new propertyData();

	//Updated using comparision instead of assignment.
	if (is_object($data) == true) $status = '200 OK';
	//Updated status header assignment.
	$status_header = "HTTP/1.1 $status";

	header($status_header);
	echo json_encode( $data->getAll($id) );
?>