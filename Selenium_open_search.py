from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

# Step 1: Launch Chrome
driver = webdriver.Chrome()

# Step 2: Open Google
driver.get("https://www.python.org")
print(driver.title)
assert "Python" in driver.title
elem=driver.find_element(By.NAME,"q")
elem.clear()
elem.send_keys("pycon")
elem.send_keys(Keys.RETURN)
assert "No results found." not in driver.page_source
time.sleep(5)
driver.close()



