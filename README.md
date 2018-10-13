# Merchant

This program is designed to be simple for the merchant to use. In terms of adding offers, the merchant can add them 
in the text document provided. 
In order to bring it up via HTTP, the merchant can open up the link (provided the server is set-up) by visiting:
http://localhost:8080/Merchant/offer
This would list all items on offer and tell the user if an item is expired. The parser class fetches the date and it is
all the rest is done in Offer_Rest using REST_api and the Jackson external library. 
