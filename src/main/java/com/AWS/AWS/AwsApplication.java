package com.AWS.AWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsApplication.class, args);
	}
}

@RestController
 class Test {
	@GetMapping("/login")
	public String doLogin() {
		return "<!DOCTYPE html>\n"
				+ "<html lang=\"en\">\n"
				+ "<head>\n"
				+ "  <title>Bootstrap Example</title>\n"
				+ "  <meta charset=\"utf-8\">\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
				+ "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n"
				+ "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n"
				+ "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n"
				+ "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n"
				+ "</head>\n"
				+ "<style>\n"
				+ "body\n"
				+ "{\n"
				+ "background-image:url(images/typewriter.jpg);;\n"
				+ "opacity:1;\n"
				+ "}\n"
				+ ".container\n"
				+ "{\n"
				+ "\n"
				+ "color:red;\n"
				+ "font-weight: bold;\n"
				+ "background-color:black;\n"
				+ "opacity:0.8;\n"
				+ "border: 2px solid red;\n"
				+ "border-radius: 50px 20px;\n"
				+ "\n"
				+ "}\n"
				+ ".container\n"
				+ "{\n"
				+ "    margin-top: 150px;\n"
				+ "  \n"
				+ "  \n"
				+ "}\n"
				+ "\n"
				+ "</style>\n"
				+ "<body>\n"
				+ "<div class=\"container\">\n"
				+ "  <h1>Please log in</h1>\n"
				+ "  <form action=\"dologin\">\n"
				+ "    <div class=\"form-group\">\n"
				+ "      <label for=\"email\">Email:</label>\n"
				+ "      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\n"
				+ "    </div>\n"
				+ "    <div class=\"form-group\">\n"
				+ "      <label for=\"pwd\">Password:</label>\n"
				+ "      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"password\">\n"
				+ "    </div>\n"
				+ "<br>\n"
				+ "    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n"
				+ "    <a href=\"showRegisterform\">Please Register</a>\n"
				+ "  </form>\n"
				+ "</div>\n"
				+ "\n"
				+ "</body>\n"
				+ "</html>";
	}
}
