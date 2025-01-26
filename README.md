# JavaPracticalClasses_QAP1
 Java Class Examples

This repository contains examples of basic Java classes and their corresponding test programs. Each class demonstrates common principles of object-oriented programming (OOP) such as encapsulation, constructors, getters/setters, and custom methods.

## Classes Included

### 1. Account Class
- **Attributes**: `id`, `name`, `balance`
- **Methods**:
  - `credit()`: Add money to the account.
  - `debit()`: Withdraw money if sufficient balance exists.
  - `transferTo()`: Transfer money to another account.
  - `toString()`: Display account details in a readable format.
- **Test Program**: `TestAccount`
  - Creates two accounts, displays initial balances, transfers money, and displays updated balances.

### 2. Date Class
- **Attributes**: `day`, `month`, `year`
- **Methods**:
  - `setDay()`, `setMonth()`, `setYear()`: Update individual date components.
  - `setDate()`: Update all date components.
  - `toString()`: Display the date in `dd/mm/yyyy` format.
- **Test Program**: `TestDate`
  - Creates a `Date` object, displays the initial date, modifies components, and prints updated values.

### 3. Time Class
- **Attributes**: `hour`, `minute`, `second`
- **Methods**:
  - `nextSecond()`: Increment time by 1 second (handles rollover).
  - `previousSecond()`: Decrement time by 1 second (handles rollover).
  - `setHour()`, `setMinute()`, `setSecond()`, `setTime()`: Update individual or all time components.
  - `toString()`: Display time in `HH:mm:ss` format.
- **Test Program**: `TestTime`
  - Creates a `Time` object, tests `nextSecond()` and `previousSecond()`, and prints the results.
