<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h1>HELLO FORM</h1>

<html:form action="hello" focus="name">
	NAME:<html:text property="name"/><html:errors property="name"/>
		 <html:submit value="SayHello"/>
</html:form>
