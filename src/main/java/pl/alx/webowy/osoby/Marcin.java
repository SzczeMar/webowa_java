package pl.alx.webowy.osoby;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/osoby/marcin")
public class Marcin {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Marcin</title>
		</head>
		<body>
		<p>Jestem <strong>Marcin</stong></p>
		</body>
		</html>
		""";
	}
}
