from selenium import webdriver

# Create a new instance of the Chrome driver
driver = webdriver.Chrome()

# Navigate to the website
driver.get('https://google.com')

# Validate the title
expected_title = 'Google'  # Change this to the expected title
actual_title = driver.title

if expected_title == actual_title:
    print('Title validation successful!')
else:
    print('Title validation failed. Expected:', expected_title, 'Actual:', actual_title)

try:
    while True:
        pass  # This will keep the program running
except KeyboardInterrupt:
    print('Closing the browser...')


# Close the browser
driver.quit()