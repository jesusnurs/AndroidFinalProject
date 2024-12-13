# Movie Application

## Overview

The Movie Application is an Android-based app that allows users to explore a variety of movies, concerts, and celebrities. It features user authentication, browsing, filtering, and personalized user profiles.

## Features

### User Authentication
- Login and Registration screens with validation.
- Secure storage of user credentials.

### Home Screen
- Displays three main categories:
- Top Films: Explore a collection of the best-rated movies.
- Celebrities: Browse profiles of popular actors and actresses.
- Concerts: View upcoming concerts and events.
- Interactive circular icons for easy navigation.

### Filter Screen
- Search bar to find movies by title.
- Genre-based filters (Action, Horror, Fantasy).
- Display of movie details including title, duration, genre, rating, and a brief description.
- Option to add movies to the user library.

### Profile Screen
- Displays user information (e.g., username, avatar).
- Logout functionality.
- Section for accessing the user's saved library of movies.


 
## Technical Details

### Dependencies
- Glide: For efficient image loading.
- Retrofit: To handle API calls.
- OkHttp: For network management.
- Room: For local database management.
- Navigation Component: For fragment navigation.



## API Documentation
The application communicates with a backend server to fetch data for movies, concerts, and humans. Below are the details of the available API endpoints:

### Get Concerts
- Endpoint: `/concerts/`
- HTTP Method: GET
- Description: Fetches a list of concerts.
- Response: A JSON array of concert objects.


### Get Humans
- Endpoint: `/humans/`
- HTTP Method: GET
- Description: Fetches a list of humans.
- Response: A JSON array of human objects.


### Get Films
- Endpoint: `/films/`
- HTTP Method: GET
- Description: Fetches a list of top films.
- Response: A JSON array of film objects.


## Screenshots

- Login/Registration Screen: Simple and intuitive login/register page.
![Снимок экрана 2024-12-13 181403](https://github.com/user-attachments/assets/74e89504-c9d2-4240-bf27-766fa041a6b8)

- Home Screen: Main navigation with categories for movies, celebrities, and concerts.
![Снимок экрана 2024-12-13 181327](https://github.com/user-attachments/assets/a03731e1-5e0a-4cd2-8334-b24b56eb1c2d)

- Filter Screen: Advanced filtering options with genre buttons and add-to-library functionality.
![Снимок экрана 2024-12-13 181346](https://github.com/user-attachments/assets/8fd89628-af0c-45c5-b70d-6341d936c148)

- Profile Screen: User information with library access and logout.
![Снимок экрана 2024-12-13 181439](https://github.com/user-attachments/assets/2b116235-49ba-4185-804d-0fcc643cdc7e)
