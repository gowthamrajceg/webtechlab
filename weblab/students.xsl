<?xml version = "1.0" encoding = "UTF-8"?>
<xsl:stylesheet version = "1.0"
   xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">  
	
   <xsl:template match = "/" >
      <html>
         <body>
            <h3>Details of each Students. </h3>
            <table border = "1">
               <tr bgcolor = "#9acd32">
                  <th bgcolor="red">Roll No</th>
                  <th>First Name</th>
                  <th>Last Name</th>
                  <th>Nick Name</th>
                  <th>Marks</th>		 
               </tr>	
					
               <tr>
                  <td><xsl:value-of select = "/class/student[1]/@rollno"/></td>
                  <td><xsl:value-of select = "/class/student[1]/firstname"/></td>
                  <td><xsl:value-of select = "/class/student[1]/lastname"/></td>
                  <td><xsl:value-of select = "/class/student[1]/nickname"/></td>
                  <td><xsl:value-of select = "/class/student[1]/marks"/></td>		 
               </tr>
					
               <tr>
                  <td>
                     <xsl:value-of select = "/class/student/@rollno"/>
                  </td>
                  <td><xsl:value-of select = "/class/student[2]/firstname"/></td>
                  <td><xsl:value-of select = "/class/student[2]/lastname"/></td>
                  <td><xsl:value-of select = "/class/student[2]/nickname"/></td>
                  <td><xsl:value-of select = "/class/student[2]/marks"/></td>		 
               </tr>
					
               <tr>
                  <td>
                     <xsl:value-of select = "/class/student[3]/@rollno"/>
                  </td>
                  <td><xsl:value-of select = "/class/student[3]/firstname"/></td>
                  <td><xsl:value-of select = "/class/student[3]/lastname"/></td>
                  <td><xsl:value-of select = "/class/student[3]/nickname"/></td>
                  <td><xsl:value-of select = "/class/student[3]/marks"/></td>		 
               </tr>
      
            </table> 
   
         </body>
      </html>
   </xsl:template>
</xsl:stylesheet>
