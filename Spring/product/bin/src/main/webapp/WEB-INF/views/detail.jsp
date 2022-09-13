<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function product_update() {
		document.form1.action = "/update";
		document.form1.submit();
	}
	function product_delete() {
		if (confirm("삭제하시겠습니까?")) {
			document.form1.action = "/delete";
			document.form1.submit();
		}
	}
</script>
</head>
<body>
	<h2>상품 정보 편집</h2>
	<form name="form1" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="product_name"
					value="${product.product_name }"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="number" name="price" value="${product.price }"></td>
			</tr>
			<tr>
				<td>상품설명</td>
				<td><textarea rows="5" cols="60" name="description">${product.description }</textarea></td>
			</tr>
			<tr>
				<td>상품이미지</td>
				<td><c:if test="${product.filename != '-' }">
						<img src="/resources/images/${product.filename }" width="300px"
							height="300px">
						<br>
					</c:if> <input type="file" name="img"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="hidden"
					name="product_code" value="${product.product_code }"> <input
					type="button" value="수정" onclick="product_update()"> <input
					type="button" value="삭제" onclick="product_delete()"> <input
					type="button" value="목록" onclick="location.href='/'"></td>
			</tr>
		</table>
	</form>

</body>
</html>