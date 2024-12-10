# TribalCraft Empowerment Platform

## Overview
**TribalCraft Empowerment** is a platform designed to promote value-added handicrafts and support tribal communities. This project aims to provide a digital marketplace where tribal artisans can display and sell their handcrafted items. By connecting artisans with local and global customers, the platform helps preserve traditional crafts and promotes cultural heritage.

---

## Key Features
### 1. **Admin Portal**
   - Manage platform content such as products and categories.
   - Monitor transactions and handle customer and artisan issues.
   - Resolve disputes and oversee the smooth operation of the platform.

### 2. **Artisan Portal**
   - Create and update product listings with images and descriptions.
   - Manage customer orders and track deliveries.
   - Communicate with customers through the platform.

### 3. **Customer Portal**
   - Explore and purchase a wide range of handcrafted items.
   - Provide feedback and reviews for purchased products.
   - Participate in special promotions and offers.

### 4. **Cultural Consultant Role**
   - Ensure the content and product descriptions accurately reflect the traditional crafts and heritage.
   - Work collaboratively with artisans to preserve authenticity.

---

## Technologies Used
- **Backend**: Spring Boot 4
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MySQL
- **Additional Tools**: 
  - Security: Spring Security
  - Authentication: JWT and role-based access
  - Deployment: GitHub (and optional further deployment to cloud services)

---

## Installation and Setup
### Prerequisites
- Install [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html).
- Install [MySQL](https://www.mysql.com/downloads/).
- Install a compatible IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
- Install [Maven](https://maven.apache.org/install.html).

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/tribalcraft-empowerment.git
   cd tribalcraft-empowerment

Configure the database:
Update the application.properties file with your MySQL username and password.
Example:
spring.datasource.url=jdbc:mysql://localhost:3306/tribalcraft
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

How It Works
Admins oversee the platform by managing content, resolving disputes, and ensuring smooth operations.
Artisans can list their products, monitor their sales, and engage with customers.
Customers can browse a variety of handcrafted products, place orders, and provide feedback.
Cultural Consultants ensure the platform respects and preserves the authenticity of traditional crafts.



Contact
If you have any questions or feedback, feel free to reach out:

Email: support@tribalcraft.com
GitHub: gnaneswar15


