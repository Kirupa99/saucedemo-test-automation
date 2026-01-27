# SauceDemo Test Case Design

| Scenario ID | Testcase Name | Test Scenario | Test Steps | Test Type |
|------------|-----------------|---------------|------------|-----------|
| TS_00 | User Signup | User navigates to signup page, fills mandatory fields, submits form, and confirms successful account creation | 1. Navigate to signup page  2. Enter mandatory details (username, password, etc.)  3. Submit the form  4. Verify success message or redirection to login page | Positive |
| TS_01 | Valid Login | User logs in with valid credentials | 1. Navigate to login page  2. Enter valid username & password  3. Click Login  4. Verify user lands on Products page | Positive |
| TS_02 | Invalid Login | User attempts login with invalid credentials | 1. Navigate to login page  2. Enter invalid username or password  3. Click Login  4. Verify error message is displayed | Negative |
| TS_03 | Locked User Login | Locked-out user attempts login | 1. Navigate to login page  2. Enter credentials of locked-out user  3. Click Login  4. Verify locked-out error message | Negative |
| TS_04 | View Product List | User browses available products | 1. Login successfully  2. Navigate to Products page  3. Scroll through products  4. Verify product images, names, and prices are displayed correctly | Positive |
| TS_05 | Sort Products | User sorts products by price or name | 1. Navigate to Products page  2. Select sorting option (Price low→high / Name A→Z)  3. Verify products are sorted accordingly | Positive |
| TS_06 | Add Product to Cart | User adds a product to the cart | 1. Navigate to Products page  2. Click "Add to Cart" on a product  3. Verify cart icon updates and product is in cart | Positive |
| TS_07 | Remove Product from Cart | User removes a product from the cart | 1. Navigate to cart page  2. Click "Remove" on a product  3. Verify cart updates and product is removed | Positive |
| TS_08 | Complete Checkout | User fills mandatory info and checks out | 1. Navigate to cart page  2. Click "Checkout"  3. Fill all mandatory fields  4. Click "Continue" / "Finish"  5. Verify success message or confirmation page | Positive |
| TS_09 | Checkout with Missing Info | User attempts checkout with missing fields | 1. Navigate to checkout page  2. Leave one or more mandatory fields empty  3. Click "Continue"  4. Verify validation error message | Negative |
| TS_10 | Logout | User logs out successfully | 1. Click "Logout" button  2. Verify user is redirected to login page | Positive |

