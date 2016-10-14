<#include "layout/default.ftl" />

<#assign title="Dashboard" />
<#macro head>
<link rel="stylesheet" href="/webjars/ace/assets/css/ace.min.css" />
</#macro>
<#macro scripts>
<script src="/webjars/ace/assets/js/jquery-ui.custom.min.js"></script>
<script src="/webjars/ace/assets/js/jquery.ui.touch-punch.min.js"></script>
</#macro>

<@page head=head scripts=scripts>

<h1>${message}</h1>

</@page>
