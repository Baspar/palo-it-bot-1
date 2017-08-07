(ns palo-it-bot.config)

(def TOKENS {:dev {:messenger {:PAGE-ACCESS-TOKEN "PAGE-ACCESS-TOKEN"
                               :VERIFY-TOKEN "VERIFY-TOKEN"
                               :APP-SECRET "APP-SECRET"}
                   :telegram {:TOKEN "TELEGRAM_TOKEN"}
                   :skype {:TOKEN "TOKEN"
                           :private "PRIVATE"
                           :public "PUBLIC"}
                   :api-ai {:CLIENT-ACCESS-TOKEN "CLIENT-ACCESS-TOKEN"
                            :DEVELOPER-ACCESS-TOKEN "DEVELOPER-ACCESS-TOKEN"
                            :URL "https://api.api.ai/v1/query?v=20150910"
                            :THRESHOLD 0.7}}})
