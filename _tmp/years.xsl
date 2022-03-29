<!--<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:key name="years" match="/root/object" use="@year" />
	<xsl:template match="root" priority="-1">
		<HTML>
			<BODY>
				<xsl:for-each select="object[generate-id()=generate-id(key('years',@year))]">
					<xsl:sort select="@year" order="descending"/>
					<xsl:value-of select="@year" />
					<xsl:if test="position()!=last()">
						<xsl:text>, </xsl:text>
					</xsl:if>
				</xsl:for-each>
			</BODY>
		</HTML>
	</xsl:template>
</xsl:stylesheet>-->