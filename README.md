This is code for the Java Spring Boot showcase site https://metrofinanceanalyst.azurewebsites.net/

It extracts data from azure postgres db to get the stock commentaries for the past 10 years from the Metrofinance Radio website
http://www.metroradio.com.hk/MetroFinance/ResearchTeam/ResearchReportsDetail.aspx

The commentaries are extracted via a node.js etl script periodically into the db

User can search the commentaries either by stock code or by the recommending institution name

The source data is not well cleansed. I have partially cleansed the data Hence there are some similar entries in both stock name and institution name
