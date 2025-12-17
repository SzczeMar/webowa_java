package pl.alx.webowy.osoby;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/osoby/zuza")
public class Zuza {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Zuza</title>
		</head>
		<body>
		<p>Jestem <strong>Zuza</stong></p>
		</body>
		</html>
		""";
	}
}
