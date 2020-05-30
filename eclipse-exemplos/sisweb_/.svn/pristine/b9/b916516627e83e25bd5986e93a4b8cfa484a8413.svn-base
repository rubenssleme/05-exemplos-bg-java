@echo off
:: Diretorios
set index=index.html
set pasta_raiz_diretorio=C:\Projetos\
set pasta_raiz_teste=target\
set pasta_raiz_site=site\
set pasta_raiz_jacoco=jacoco\
set pasta_raiz_sisweb_teste_index=%pasta_raiz_teste%%pasta_raiz_site%%pasta_raiz_jacoco%%index%
:: Sistemas
set sistema_sisweb=sisweb
:main
goto redirecionador

:redirecionador
echo Redirecionando para Sisweb...
cd %pasta_raiz_diretorio%
goto sisweb

:sisweb
cd %sistema_sisweb%
echo Iniciando...
call mvn prepare-package
echo Pressione qualquer tecla para ver os testes
pause > nul
start %pasta_raiz_sisweb_teste_index%