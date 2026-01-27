# SauceDemo Test Plan
**Version:** 1.0  
**Application Under Test:** SauceDemo  
**Test Type:** Manual & Automation (Selenium Java)

---

## 1. Introduction
SauceDemo is a sample e-commerce web application that simulates core online shopping workflows such as **login, product browsing, cart management, and checkout**.  

The purpose of this test plan is to define the **testing strategy, scope, approach, and deliverables** for validating the functional and non-functional aspects of the SauceDemo application using both **manual and Selenium automation testing**.

---

## 2. Test Objectives
- **Validate core workflows** function as expected.  
- **Ensure users can complete shopping activities** without errors.  
- **Identify functional, UI, and usability defects.**  
- **Automate critical regression scenarios** using Selenium WebDriver (Java).  
- **Demonstrate scalability** of the test approach for advanced testing types.

---

## 3. Application Features Overview
- **User Authentication:** Login / Logout  
- **Product Listing**  
- **Product Sorting**  
- **Cart Management**  
- **Checkout Workflow** (mandatory field validation only)  
- **Navigation & Session Handling**

---

## 4. Test Scope

### 4.1 In Scope
**Functional Modules**
- Login (valid, invalid, locked user)  
- Product listing visibility  
- Sorting (price, name)  
- Add to cart / remove from cart  
- Cart validation  
- Checkout flow  
- Logout  
- Session handling

**Testing Types**
- Functional Testing  
- Smoke Testing  
- Regression Testing  
- UI Testing  
- Cross-browser Testing (conceptual / extendable)

### 4.2 Out of Scope
- Real payment gateway processing  
- Backend database validation  
- Order persistence after session end  
- Third-party integrations (social media, analytics)

---

## 5. Test Approach

### 5.1 Manual Testing
- Requirement-based test scenario design  
- Positive and negative test cases  
- Boundary and validation testing  
- Defect identification and documentation

### 5.2 Automation Testing
- Selenium WebDriver with Java  
- TestNG framework  
- Page Object Model (POM) design pattern  
- Reusable test components  
- Automated regression suite for core workflows

### 5.3 CI/CD (Planned & Implemented)
- Automated execution via **GitHub Actions**  
- Test execution triggered on code commit  
- Report generation after execution

> **Note:** Advanced automation and CI/CD coverage will be expanded incrementally.

---

## 6. Test Types Covered
- **Functional Testing:** Login, product interaction, cart & checkout flows, navigation consistency  
- **Usability Testing:** Ease of navigation, clarity of product information, error messages, checkout flow simplicity  
- **Compatibility Testing (Conceptual):** Chrome, Firefox, Edge; desktop & laptop resolutions  
- **Accessibility Testing (Awareness):** Keyboard navigation, label visibility, color contrast  
- **Performance & Security Testing (Conceptual):** Page load time observation, HTTPS usage validation, input validation awareness

---

## 7. Test Scenarios Overview

| Scenario ID | Test Scenario | Type | Description |
|------------|---------------|------|------------|
| TS_00 | User Signup (Conceptual) | Positive | User navigates to signup page, fills mandatory fields, submits form, and confirms successful account creation |
| TS_01 | Valid Login | Positive | User logs in with valid credentials |
| TS_02 | Invalid Login | Negative | User attempts login with invalid credentials |
| TS_03 | Locked User Login | Negative | Locked-out user attempts login |
| TS_04 | View Product List | Positive | User browses available products |
| TS_05 | Sort Products | Positive | User sorts products by price or name |
| TS_06 | Add Product to Cart | Positive | User adds a product to the cart |
| TS_07 | Remove Product from Cart | Positive | User removes a product from the cart |
| TS_08 | Complete Checkout | Positive | User fills mandatory info and checks out |
| TS_09 | Checkout with Missing Info | Negative | User attempts checkout with missing fields |
| TS_10 | Logout | Positive | User logs out successfully |


---

## 8. Test Data
- Valid user credentials  
- Invalid user credentials  
- Locked user credentials  
- Valid checkout information  
- Empty / invalid checkout data

---

## 9. Test Environment
- **Browser:** Chrome (primary)  
- **OS:** Windows / macOS  
- **Language:** Java  
- **Tools:** Selenium WebDriver, TestNG, Maven, GitHub, GitHub Actions

---

## 10. Entry & Exit Criteria

**Entry Criteria**
- Application accessible  
- Test environment ready  
- Test data available  

**Exit Criteria**
- All critical test cases executed  
- No open blocker defects  
- Automation suite executed successfully

---

## 11. Test Deliverables
- Requirement Analysis Document  
- Test Plan  
- Test Scenarios  
- Test Cases  
- Selenium Automation Scripts  
- Execution Reports  
- CI/CD Workflow Configuration

---

## 12. Risks & Mitigation

| Risk | Mitigation |
|------|------------|
| Limited app functionality | Focus on workflow depth |
| Test data resets | Use static test data |
| Demo environment instability | Rerun tests and document |

