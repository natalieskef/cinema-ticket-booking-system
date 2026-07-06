# Cinema Ticket Booking & Pricing System

A practical Java terminal application designed to compute dynamic cinema ticket pricing structures based on specific seat standards and screening showtimes using type-safe custom components.

## Technical Architecture Overview

### 1. Multi-Parameterized Java Enums
* **`SeatType` & `ShowTime`:** Implements data representation using state-bound enumerations. Instead of using generic Strings or loose integers, variables are locked into static sets (`STANDART`, `PREMIUM`, `VIP`), each holding its custom financial multiplier sequence (`fiyatCarpani`).

### 2. Absolute Type Safety
* **Eliminating Primitive Obsession:** Refactors loose object configurations into concrete enumeration structures inside `CinemaTicket`. This completely mitigates runtime anomalies triggered by arbitrary input values.

### 3. Dynamic Input Control Loop
* **`Scanner` Interface:** Handles input parsing inside the execution class while applying verification constraints to evaluate conditional purchase requirements (e.g., maximum transaction counts).

## Tech Stack
* **Language:** Java 8+
* **Key Mechanisms:** Multi-state Bound Enums, Data Consolidation, Stream Evaluation, Robust Parameter Verification.
