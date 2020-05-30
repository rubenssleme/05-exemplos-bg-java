for %%f in (dir *.sql) do (
	psql -U postgres -d sisweb -f %%f
)
