Feature: Sending Amazon egift card (specific amount) to specific reciepient and adding it to cart on Amazon website 

Scenario Outline: Position test validating login
Given Intitaliaze the browser and  Navigate to Amazon website  site
Given Click on the Search option and search for <Amazon egift card>
When User enters Standard egift card type and select the amount of gift card <value>
And User enter desired reciepient email <reciepientemail> where the gift card needs to be sent
And User enter desired sender name <sendername> for the gift card
And User enter message <message> for the gift card
Then User add egift card to cart and checkout
Then User enter credentials email <email> and password <password> for the amazon account
Then Close browser

Examples:
|Amazon egift card|		|value|			|reciepientemail|							|sendername|	|message							 |		|email											|		|password		|
|Amazon egift card|		|365|				|Autorizeduser@amzaon.ca|			|Friend|			|This is your gift card|		|amazontestjava@gmail.com		|		|Amazon@123		|
											