# Micronaut <-> Spring boot  Cheatsheet

| Spring | Micronaut| Notes |
|--------|----------| ------|
| @RestController | @Controller |
| @GetMapping | @Get |
| @PostMapping | @Post |
| @Service | @Singleton |
| @Autowired | @Inject |
| @Qualifier | @Qualifier |
| @RequestBody | @Body|
| @PathVariable | @PathVariable|
| @Primary | @Primary|
| ResponseEntity | HttpResponse|

# Scopes

| Spring | Micronaut| Notes |
|--------|----------| ------|
| @Scope("singleton") |    @Singleton
|                     |     @Context |
| @Scope("prototype")  | @Prototype|
| @RequestScope  | |
| @SessionScope  | |
|@ApplicationScope||
|@Scope("websocket")||
|    | @Infrastructure |
|    | @ThreadLocal |
| @RefreshScope | @Refreshable|

# JPA
<table border="1px;">
<tr><th>Spring</th><th>Micronaut</th><th>Notes</th></tr>
<tr><td>@EnableJpaRepositories(basePackages = {"com.test"})</td>
<td>

````
jpa:
  default:
    packages-to-scan:
      - com.test                        
````

</td>
</tr>

</table> 

</table>