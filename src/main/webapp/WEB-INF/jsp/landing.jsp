<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>ABC Bank | Secure Digital Banking</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/landing.css">
</head>

<body>

<!-- ===== Header ===== -->
<header class="header">
    <div class="container header-flex">
        <div class="logo">ABC<span>Bank</span></div>
        <nav>
            <a href="#features">Features</a>
            <a href="#security">Security</a>
            <a href="#contact">Contact</a>
            <a href="${pageContext.request.contextPath}/login" class="btn-outline">Login</a>
        </nav>
    </div>
</header>

<!-- ===== Hero Section ===== -->
<section class="hero">
    <div class="container hero-grid">
        <div class="hero-text">
            <h1>Smart, Secure & Modern Banking</h1>
            <p>
                Experience next-generation digital banking with real-time transactions,
                enterprise-grade security, and seamless account management.
            </p>
            <div class="hero-buttons">
                <a href="${pageContext.request.contextPath}/login" class="btn-primary">Login</a>
                <a href="${pageContext.request.contextPath}/signup" class="btn-secondary">
