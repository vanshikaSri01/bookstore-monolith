# Bookstore – Modular Monolith using Spring Modulith

## Architecture

This project demonstrates a proper Modular Monolith implementation
using Spring Modulith.

## Modules

- orders
- inventory

Each top-level package represents a module.

## Key Principles Applied

✔ Internal packages are hidden  
✔ Modules interact only through public APIs  
✔ No cyclic dependencies  
✔ Verified using ApplicationModules.verify()

## Running the Modularity Test
- mvn test


The test ensures:
- No illegal internal access
- No cycles
- Proper module boundaries

## Important Design Decision

The `orders.internal` package is hidden by:
- Making classes package-private
- Exposing only `OrderService` as public API

Inventory module depends only on `OrderService`.