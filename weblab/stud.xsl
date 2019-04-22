<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0"
 xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Student Details - Transformation</title>
<style>
caption
{
color:red;
}
</style>
</head>

<body>
<table border="1">
<caption>Student Details</caption>
<tr bgcolor="#9acd32">
<th>Name</th><th>Department</th><th>Register No</th>
</tr>
<xsl:for-each select="/studInfo/stud">
       <xsl:sort select="artist"/>
<tr bgcolor="blue">
<td><xsl:value-of select="name"/></td>
<td><xsl:value-of select="dept"/></td>
<td><xsl:value-of select="rno"/></td>
</tr>
</xsl:for-each>
</table>
</body>   
 </html>    
</xsl:template>    
</xsl:transform>


