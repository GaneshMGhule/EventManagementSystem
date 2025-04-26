# Event Management System
## Overview

The Event Management System is a web application built with Angular that allows users to create, view, edit, and delete events. Users can also register and manage their accounts. The application features a user-friendly interface and utilizes Angular's routing capabilities for seamless navigation.

## Features

- User registration and authentication
- Create, Read, Update, and Delete (CRUD) events
- View detailed event information
- Responsive design (mobile-friendly)
- Error handling and form validation

## Technologies Used

- Angular
- TypeScript
- HTML/CSS
- RxJS
- Bootstrap (or another CSS framework)
- JSON Server (for mock backend)

## Prerequisites

- Node.js (version 14 or higher)
- Angular CLI (version 12 or higher)

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/event-management-system.git
   cd event-management-system
   ```

2. **Install dependencies:**

   ```bash
   npm install
   ```

3. **Set up the mock backend:**

   Install JSON Server globally (if not already installed):

   ```bash
   npm install -g json-server
   ```

   Create a `db.json` file in the root of the project with the following content:

   ```json
   {
     "events": [],
     "users": []
   }
   ```

4. **Run the mock server:**

   ```bash
   json-server --watch db.json
   ```

   This will start the server at: [http://localhost:3000](http://localhost:3000).

5. **Run the Angular application:**

   In a new terminal window, run:

   ```bash
   ng serve
   ```

   The application will be available at: [http://localhost:4200](http://localhost:4200).

## Usage

- Navigate to the **Registration** page to create a new account.
- Log in to access event management features.
- Create new events, view the event list, and edit or delete existing events.
- Use the navigation links to move between different sections.



## Screenshots

## 🖼️ Project Screenshots

<p align="center">
  <img src="https://github.com/GaneshMGhule/EventManagementSystem/blob/main/ss/Home.jpg" width="700" alt="Home"/>
  <br><b>1) Home Page</b>
</p>


<p align="center">
  <img src="https://github.com/GaneshMGhule/EventManagementSystem/blob/main/ss/Added%20Event.jpg" width="700" alt="patientsrecords"/>
  <br><b>2) Add Event</b>
</p>


<p align="center">
  <img src="https://github.com/GaneshMGhule/EventManagementSystem/blob/main/ss/List%20of%20event.jpg" width="700" alt="List Event"/>
  <br><b>3) List Of Event</b>
</p>


<p align="center">
  <img src="https://github.com/GaneshMGhule/EventManagementSystem/blob/main/ss/update.jpg" width="700" alt="Update"/>
  <br><b>4) Update Event</b>
</p>


## Folder Structure

```plaintext
event-management-system/
│
├── src/
│   ├── app/
│   │   ├── event/
│   │   │   ├── event-create/
│   │   │   ├── event-detail/
│   │   │   ├── event-list/
│   │   │   ├── event.model.ts
│   │   │   ├── event.service.ts
│   │   │   └── event.module.ts
│   │   ├── register/
│   │   │   ├── register.component.ts
│   │   │   └── register.component.html
│   │   ├── auth.service.ts
│   │   ├── app-routing.module.ts
│   │   ├── app.component.ts
│   │   ├── app.module.ts
│   │   └── app.config.ts
│   ├── assets/
│   ├── environments/
│   └── ...
├── snapshots/
├── screenshots/
├── db.json
├── angular.json
├── package.json
└── README.md
```



