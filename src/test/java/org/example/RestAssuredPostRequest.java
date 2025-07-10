package org.example;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

public class RestAssuredPostRequest {

    public static void main(String[] args) {

        String json = "<?xml version='1.0' encoding='UTF-8'?>\n" +
                "<worldcheck-update>\n" +
                "    <profile>\n" +
                "        <type>F</type>\n" +
                "        <first-name>DFGHJKHVBJKBJdfdyuf</first-name>\n" +
                "        <uid>25</uid>\n" +
                "        <!-- <special-interest-categories>\n" +
                "            <special-interest-category>M:FB</special-interest-category>\n" +
                "        </special-interest-categories>     -->\n" +
                "        <category>CRIME - WAR</category>\n" +
                "        <urls>\n" +
                "            <url cache=\"CACHE\">\n" +
                "                <link>https://en.wikipedia.org/wiki/Park</link>\n" +
                "            </url>\n" +
                "            <url cache=\"NOCACHE\">\n" +
                "                <link>https://en.wikipedia.org/wiki/Mobile</link>\n" +
                "            </url>\n" +
                "            <url cache=\"CACHE\">\n" +
                "                <link>https://en.wikipedia.org/wiki/Charger</link>\n" +
                "                <!-- <tags>\n" +
                "                    <tag>PHOTO</tag>\n" +
                "                </tags> -->\n" +
                "            </url>\n" +
                "        </urls>\n" +
                "        <citizenships>\n" +
                "            <citizenship>CA</citizenship>\n" +
                "        </citizenships>\n" +
                "        <further-information>[BIOGRAPHY] TES'T [IDENTIFICATION] TEST [REPORTS] TEST [FUNDING] test funding header</further-information>\n" +
                "        <locations>\n" +
                "            <location>\n" +
                "                <name></name>\n" +
                "                <country>AF</country>\n" +
                "                <state></state>\n" +
                "                <city></city>\n" +
                "            </location>\n" +
                "        </locations>\n" +
                "        <last-name>peter parker</last-name>\n" +
                "        \n" +
                "    </profile>\n" +
                "</worldcheck-update>";

        Response res = given().auth().basic("dante","#Way^tiNg4fRy_dAY!")
                .contentType(ContentType.XML).body(json)
                .when().post("https://api-sin-qla01.world-check.com/api/update");
        Assert.assertEquals(res.getContentType(),"application/xml");
        Assert.assertTrue(Integer.parseInt(res.getHeader("Content-Length"))>100);
        Assert.assertTrue(res.header("Server").equals("nginx"));

        Assert.assertTrue(res.header("Date").contains("Wed, 09 Jul 2025"));

//        String s = res.path("message");
//        System.out.println(s);
//
//        JsonPath path = res.jsonPath();
//        String status = path.get("status");
//        System.out.println(status);
//        System.out.println(path);

    }

}
