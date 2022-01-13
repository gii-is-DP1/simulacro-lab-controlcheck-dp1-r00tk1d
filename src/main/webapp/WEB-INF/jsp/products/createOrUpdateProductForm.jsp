<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="prods">
        <form:form name="productInput" modelAttribute="product" class="form-horizontal">
            <form:input type="text" path="name"/>
            <form:input type="text" path="price" value=""/>
            <form:select path="productType">
                <form:options items="${productTypes}"></form:options>
            </form:select>
            <button class="btn btn-default" type="submit">Submit</button>
        </form:form>
</petclinic:layout>