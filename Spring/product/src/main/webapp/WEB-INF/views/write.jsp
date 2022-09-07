<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품 등록</h2>
	<form name="form1" method="post" enctype="multipart/form-data"
		action="insert">
		<table>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="product_name"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="number" name="price"></td>
			</tr>
			<tr>
				<td>상품설명</td>
				<td><textarea rows="5" cols="60" name="description"></textarea></td>
			</tr>
			<tr>
				<td>상품이미지</td>
				<td><input type="file" name="img"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="등록">
					<input type="button" value="목록" onclick="location.href='list'">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>