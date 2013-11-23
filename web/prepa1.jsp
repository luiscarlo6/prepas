<%-- 
    Document   : prepa1
    Created on : 14/11/2013, 10:01:00 AM
    Author     : jidc28
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PAGINA 1</title>
    </head>
    <body>
        <h1>ESTA ES LA PRIMERA PAGINA DE LA PREPA</h1>
        <html:link action="/linkAprepa2">
            <html:button property="" value="LINK"></html:button>

        </html:link>

        <html:form action="/formulario1" acceptCharset="UTF-8">
            <table border="0">
                <tbody>
                    <tr>
                        <td> Codigo </td>
                        <td>
                            <html:text name="Prepa" property="codigo"/>

                        </td>
                    </tr>
                    <tr>
                        <td> Nombre </td>
                        <td>
                            <html:text name="Prepa" property="nombre"/>
                        </td>
                    </tr>
                </tbody>
            </table>
            <p>

                <html:submit value="agregar"/>
                <html:reset value="reset"/>
            </p>
        </html:form>

    </body>
</html>
