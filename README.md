# Merchant

This program is designed to be simple for the merchant to use. In terms of adding offers, the merchant can add them 
in the text document provided. 
In order to bring it up via HTTP, the merchant can open up the link (provided the server is set-up) by visiting:
http://localhost:8080/Merchant/offer
This would list all items on offer and tell the user if an item is expired. The parser class fetches the date and it is
all the rest is done in Offer_Rest using REST_api and the Jackson external library. 

Assumptions:
"Before an offer has expired users may cancel it." - I did not know what the document meant by 'users' so I assumed it 
to be the merchant themselves. Since the merchant interacts with only the document in terms of handling offers,
hence cancellation can just be a mere deletion of the offer line entirely.
