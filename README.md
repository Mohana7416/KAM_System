# Key Account Manager (KAM) Lead Management System

Udaan, a B2B e-commerce platform, requires a Lead Management System for Key Account Managers (KAMs) who manage relationships with large restaurant accounts. This system will help track and manage leads, interactions, and account performance.


## Project Overview
1. [Project Overview](#project-overview)
2. [System Requirements](#System-Requirements)
3. [Installation Instructions](#Installation-Instructions)



---

## Project Overview

The **Lead Management System** assists Key Account Managers (KAMs) on the Udaan platform in efficiently managing large restaurant accounts. The system focuses on key aspects such as:

- **Lead Management**: Adding, tracking, and updating leads.
- **Contact Management**: Managing multiple points of contact (POCs).
- **Call Planning**: Scheduling and tracking calls.
- **Interaction Tracking**: Recording calls and orders.
- **Performance Tracking**: Monitoring account performance.

---

## System Requirements

### **Software Requirements**
- **Backend**:
    - **JDK**
    - **IntelliJ IDEA** (Recommended for Java development)
  
- **Database**:
    -  MySQL
- **Testing Tools**:
    - Postman

---

## Installation Instructions


# JDK Installation Guide

Follow these steps to install the Java Development Kit (JDK) on your system.

---

## For Windows

### Step 1: Download JDK
- Go to the official Oracle website: [Oracle Java Downloads](https://www.oracle.com/java/technologies/javase-downloads.html).
- Choose the latest JDK version (e.g., JDK 17 or JDK 20) suitable for your operating system.
- Download the `.exe` installer.

### Step 2: Install JDK
- Locate the downloaded `.exe` file and double-click to launch the installer.
- Follow the installation wizard:
    1. Accept the License Agreement.
    2. Choose the installation path (default is recommended).
    3. Complete the installation.

### Step 3: Configure Environment Variables
1. Open the Start menu and search for "Environment Variables."
2. Click **Edit the system environment variables**.
3. In the **System Properties** window, click the **Environment Variables** button.
4. Under **System Variables**, do the following:
    - Find the `Path` variable and click **Edit**.
    - Add the path to the `bin` directory of your JDK installation (e.g., `C:\Program Files\Java\jdk-17\bin`).
5. Click **OK** to save and close all windows.

### Step 4: Verify Installation
1. Open a command prompt.
2. Run the following command to verify the JDK version:
   ```bash
   java -version
---

# Installation Steps for IntelliJ IDEA

Follow these steps to install IntelliJ IDEA on your system:

### **Step 1: Download IntelliJ IDEA**

1. Visit the official [IntelliJ IDEA download page](https://www.jetbrains.com/idea/download/).
2. Choose the version of IntelliJ IDEA you want to install:
    - **Community Edition** (Free and open-source)
    - **Ultimate Edition** (Paid version with extra features for enterprise development)

   For most Java and Spring Boot development, **Community Edition** is sufficient.

3. Click the **Download** button for your operating system (Windows, macOS, or Linux).

---

### **Step 2: Install IntelliJ IDEA**

#### **For Windows:**

1. Once the `.exe` installer is downloaded, run the installer.
2. Follow the installation instructions in the setup wizard.
3. Select your preferred installation options, such as creating desktop shortcuts, associating `.java` files with IntelliJ IDEA, etc.
4. Click **Install** to begin the installation process.
5. Once the installation is complete, click **Finish** to launch IntelliJ IDEA.

#### **For macOS:**

1. Once the `.dmg` installer is downloaded, double-click the file to open it.
2. Drag the IntelliJ IDEA icon to the **Applications** folder.
3. Open IntelliJ IDEA from the **Applications** folder.



---

### **Step 3: Initial Setup**

1. After launching IntelliJ IDEA for the first time, you may be asked if you want to import settings from a previous installation (if applicable). Choose the appropriate option.
2. The IDE will then ask you to select a theme (Light or Dark). Choose your preferred theme.
3. Click **Start using IntelliJ IDEA** to begin using the IDE.

---

# Installation Steps for -------

Follow these steps to install MySQL on your system:

### **Step 1: Download MySQL**

1. Visit the official MySQL download page:  
   [https://dev.mysql.com/downloads/installer/](https://dev.mysql.com/downloads/installer/)

2. Choose the version based on your operating system (Windows, macOS, or Linux).

3. Select the **MySQL Installer** for **Windows** or the appropriate installer for your system.

4. Click **Download**.

---

### **Step 2: Install MySQL**

#### **For Windows:**

1. Once the `.msi` installer is downloaded, double-click the installer to begin the installation process.

2. Follow the on-screen instructions:
    - Select **Developer Default** for a full installation (includes MySQL Server, MySQL Workbench, MySQL Shell, etc.).
    - Choose the installation path or leave it as default.

3. The installer will check for system requirements. Ensure that all necessary components are installed (e.g., Visual C++ Redistributable).

4. Click **Next** to proceed and then click **Execute** to begin the installation of all required components.

5. During the installation, you will be asked to configure MySQL Server:
    - Set a **root password** (this will be the administrative password for MySQL).
    - Choose the **configuration type** (typically **Development Machine**).
    - Click **Next** to proceed.

6. After the installation is complete, click **Finish**.

#### **For macOS:**

1. Download the `.dmg` package for macOS from the official MySQL website.

2. Open the `.dmg` file and double-click the **MySQL.pkg** file to start the installation.

3. Follow the instructions in the installation wizard and complete the installation.

4. After installation, MySQL should be running. To start or stop MySQL, you can use the **System Preferences** panel or terminal commands.

---

# Installation Steps for Postman

Follow these steps to install Postman on your system:

### **Step 1: Download Postman**

1. Visit the official Postman download page:  
   [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

2. Choose the version of Postman based on your operating system:
    - **Windows** (32-bit or 64-bit)
    - **macOS** (Intel or Apple Silicon)
    - **Linux** (Debian/Ubuntu, RedHat/Fedora)

3. Click **Download** for your operating system.

---

### **Step 2: Install Postman**

#### **For Windows:**

1. Once the `.exe` installer is downloaded, run the installer.

2. Follow the installation instructions in the setup wizard.

3. Choose the installation path or leave it as default.

4. Once the installation is complete, click **Finish** to launch Postman.

#### **For macOS:**

1. Once the `.dmg` file is downloaded, double-click the file to mount it.

2. Drag the **Postman** application into the **Applications** folder.

3. Open Postman from the **Applications** folder.


### **Step 3: Launch Postman**

1. After installation, open Postman:
    - **Windows**: Postman can be found in the Start Menu.
    - **macOS**: Open Postman from the **Applications** folder.
---
