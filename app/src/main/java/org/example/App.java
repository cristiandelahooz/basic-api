package org.example;

import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        /**
         * This is a simple example of how to create a simple web server using Javalin.
         * We create a simple HTML page and serve it using Javalin.
         */
        String html = """
                <!DOCTYPE html>
                <html>
                    <head>
                        <title>Hello World</title>
                        <style>
                            body {
                                font-family: Arial, sans-serif;
                                margin: 0;
                                padding: 0;
                                background-color: #f0f0f0;
                            }
                            h1 {
                                color: #333;
                                text-align: center;
                                margin-top: 50px;
                            }
                            p {
                                color: #666;
                                text-align: center;
                                margin-top: 20px;
                            }
                        </style>
                    </head>
                    <body>
                        <h1>Hello World</h1>
                        <p>Javalin is a simple web framework for Java and Kotlin.</p>
                        <p>It is lightweight and has a simple and expressive API.</p>
                    </body>
                </html>
                        """;
        Javalin app = Javalin.create().start(7080);

        app.get("/", ctx -> ctx.html(html));

    }
}
