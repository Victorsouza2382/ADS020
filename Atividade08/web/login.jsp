
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
    <h:head>
        <title>Facelet Title</title>
    </h:head>
    <h:body>
        <h:messages errorStyle="color: red"/>
        <h:form>
            <h:panelGrid columns="2">
                <h:outputLabel value="Matrícula" for="inputMatricula"/>
                <h:inputText id="inputMatricula" value="#{loginMB.matricula}"/>
                <h:outputLabel value="Senha" for="inputSenha"/>
                <h:inputSecret id="inputSenha" value="#{loginMB.senha}"/> 
                <h:commandButton value="Entrar" action="#{loginMB.entrar}"/>
                <h:outputLink><h:outputText value="Esqueci a senha"/></h:outputLink>
            </h:panelGrid>
        </h:form>
    </h:body>
</html>
