<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.vemprafam.pojo.Produto"%>
<%@page import="br.vemprafam.dao.DaoProduto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fam" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<title>Busca</title>
</head>
<body>
<fmt:formatDate value="${produto.dataCompra}" pattern="dd/MM/yyyy" var="fDataCompra" />
<form action="alterarProduto">
código:<input type="text" name="codigo" value="${produto.codigo}"/><br/>
descrição:<input type="text" name="descricao" value="${produto.descricao}"/><br/>
quantidade:<input type="text" name="quantidade" value="${produto.quantidade}"/><br/>
preço:<input type="text" name="preco" value="${produto.preco}"/><br/>
Data da Compra:<fam:campoData id="dataCompra" value="${fDataCompra}"/><br/>
<input type="submit" value="enviar"/>
</form>
<a href="menu">voltar</a>
</body>
</html>