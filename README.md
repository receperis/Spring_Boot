# News

## Introduction

In this project we have built the backend for a news site where users can create articles, comment them. The main way to interact with our application is using APIs (No graphical user interface).

## Recommended tools for manuplating the API

* [Postman](https://www.postman.com).
* [Curl](https://docs.oracle.com/en/cloud/saas/marketing/eloqua-develop/Developers/GettingStarted/APIRequests/curl-requests.htm).

## Technologies employed

* Spring (boot)
* PostgreSQL
* Docker


Article is the core entity and an article has the following fields:

* `title` the title of the article.
* `body` text body of the article .
* `authorName` the name of the author who created the article (String).
* `id` field to identify each article

Example article (JSON):

```javascript
{
    "id": 1,
    "title": "10 reasons to learn Spring",
    "body": "In this article I'll be listing 10 reasons why you should learn spring and use it in your next project...",
    "authorName": "John Smith"
}
```

REST API for articles has the following specification:

| HTTP Method | HTTP Path | Action |
| ------------|-----------|--------|
| `GET` |`/articles` | return all articles. |
| `GET` | `/articles/{id}` | return a specific article based on the provided id.|
| `POST`| `/articles` | create a new article.|
| `PUT` | `/articles` | update the given article.|
| `DELETE` | `/articles` | delete the given article.|

Visitors are able to comment the different articles. Each article can have zero or more comments. The comment object has the following fields:

* `id`
* `body` the comment text body (String)
* `authorName` the name of the author of the comment
* `article`

Example comment

```javascript
{
    "id": 1,
    "body": "This article is very well written",
    "authorName": "John Smith",
    "article": {
        "id": 1,
        "title": "10 reasons to learn Spring",
        "body": "In this article I'll be listing 10 reasons why you should learn spring and use it in your next project...",
        "authorName": "John Smith"
    }
}

```

REST API for the comments has the following specification:

| HTTP Method | HTTP Path | Action |
| ------------|-----------|--------|
| `GET` |`/comments` | return all comments. |
| `GET` | `/comments?articleId={articleId}` | return all comments with the given `articleId`.|
| `POST`| `/comments` | create a new comment.|
| `PUT` | `/comments` | update the given comment.|
| `DELETE` | `/comments` | delete the given comment.

