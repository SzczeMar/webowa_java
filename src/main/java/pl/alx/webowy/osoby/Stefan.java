package pl.alx.webowy.osoby;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/osoby/stefan")
public class Stefan {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Stefan</title>
		</head>
		<body>
		<p>Jestem <strong>Stefan</stong></p>
		</body>
		</html>
		""";
	}
}
