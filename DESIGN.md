---
name: Warm Artisanal Coffee
colors:
  surface: '#fbf9f5'
  surface-dim: '#dbdad6'
  surface-bright: '#fbf9f5'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f5f3ef'
  surface-container: '#efeeea'
  surface-container-high: '#eae8e4'
  surface-container-highest: '#e4e2de'
  on-surface: '#1b1c1a'
  on-surface-variant: '#534438'
  inverse-surface: '#30312e'
  inverse-on-surface: '#f2f0ed'
  outline: '#867466'
  outline-variant: '#d8c3b3'
  surface-tint: '#8e4e00'
  primary: '#8a4c00'
  on-primary: '#ffffff'
  primary-container: '#a96419'
  on-primary-container: '#fffbff'
  inverse-primary: '#ffb778'
  secondary: '#715950'
  on-secondary: '#ffffff'
  secondary-container: '#f9d9cd'
  on-secondary-container: '#755d54'
  tertiary: '#296749'
  on-tertiary: '#ffffff'
  tertiary-container: '#438061'
  on-tertiary-container: '#f6fff6'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#ffdcc1'
  primary-fixed-dim: '#ffb778'
  on-primary-fixed: '#2e1500'
  on-primary-fixed-variant: '#6c3a00'
  secondary-fixed: '#fcdcd0'
  secondary-fixed-dim: '#dfc0b5'
  on-secondary-fixed: '#281811'
  on-secondary-fixed-variant: '#574239'
  tertiary-fixed: '#b0f1cb'
  tertiary-fixed-dim: '#95d4b0'
  on-tertiary-fixed: '#002112'
  on-tertiary-fixed-variant: '#0d5135'
  background: '#fbf9f5'
  on-background: '#1b1c1a'
  surface-variant: '#e4e2de'
typography:
  headline-xl:
    fontFamily: Plus Jakarta Sans
    fontSize: 32px
    fontWeight: '700'
    lineHeight: 40px
  headline-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 24px
    fontWeight: '700'
    lineHeight: 32px
  headline-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 20px
    fontWeight: '600'
    lineHeight: 28px
  title-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 18px
    fontWeight: '600'
    lineHeight: 24px
  body-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
  body-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 14px
    fontWeight: '400'
    lineHeight: 20px
  body-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 12px
    fontWeight: '400'
    lineHeight: 16px
  label-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 14px
    fontWeight: '600'
    lineHeight: 20px
  label-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 12px
    fontWeight: '600'
    lineHeight: 16px
  price-badge:
    fontFamily: Plus Jakarta Sans
    fontSize: 14px
    fontWeight: '700'
    lineHeight: 18px
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  gutter: 1rem
  margin: 1.25rem
  space-xs: 0.25rem
  space-sm: 0.5rem
  space-md: 1rem
  space-lg: 1.5rem
  space-xl: 2rem
---

## Brand & Style

This design system is tailored for an inviting, artisanal, and modern mobile café experience. It transforms functional mobile ordering into an appetizing ritual through rich warm tones, tactile depth, and buttery smooth touch targets.

### Target Audience & Personality
The target audience consists of urban commuters, remote creatives, and casual café lovers seeking quick coffee runs, bakery treats, or seamless delivery. The personality is warm, artisanal, welcoming, reliable, and sensory-driven.

### Design Aesthetic
The aesthetic balances **Modern Tactile Minimalism** with **Warm Hospitality**. It avoids clinical monochrome interfaces in favor of creamy milk foam backgrounds, deep roasted espresso typography, rich amber caramel highlights, and organic rounded card surfaces. Fresh herbal matcha green is reserved as an energetic accent for positive actions, confirmations, and availability badges.

## Colors

The color palette translates the tactile sensations of a specialty coffee bar into a digital hierarchy:

- **Primary (`#C87D32` - Caramel Amber):** Used for primary calls-to-action, active bottom tab highlights, interactive tags, and promotional highlights. Evokes rich golden caramel and artisanal crema.
- **Secondary (`#2B1A13` - Dark Roasted Espresso):** Used for solid brand buttons, primary headings, high-contrast badges, and deep structured elements. Provides anchor contrast and legible authority.
- **Tertiary (`#3E7B5C` - Fresh Matcha Mint):** Applied to success states, active delivery tracking icons, confirmation checkmarks, and organic/fresh item indicators.
- **Neutral Surface (`#FDFBF7` - Steamed Milk Cream):** Soft, warm off-white canvas that replaces harsh digital whites, reducing eye fatigue and giving menus a bakery-paper warmth.
- **Sub-neutrals & Borders:** Muted oat tones (`#EFE8DE`) for dividers and borders, with rich mocha brown (`#6E584E`) for body and secondary metadata.

## Typography

The type system relies on **Plus Jakarta Sans** across all levels. Its balanced geometric construction, humanized terminals, and friendly geometry make menu descriptions legible and welcoming on handheld screens.

- **Headlines (`headline-xl`, `headline-lg`):** Reserved for screen greetings ("Halo Nama,"), splash taglines, and onboarding checkpoints. Set in rich Espresso (`#2B1A13`) with tight tracking.
- **Titles & Badges (`title-md`, `price-badge`):** Applied to product names, category tabs, and numerical prices for rapid scanning.
- **Body (`body-md`, `body-sm`):** Handles ingredient lists, roast profiles, and delivery directions using balanced line heights and muted mocha tones.
- **Labels (`label-lg`, `label-md`):** High-contrast, semi-bold text for actionable interactive states and form field tags.

## Layout & Spacing

The layout is built for native mobile ergonomics, utilizing an 8pt spatial grid adapted to one-handed thumb interaction.

### Mobile Grid & Canvas Model
- **Outer Margins:** Fixed `1.25rem` (20px) horizontal safe margin ensuring content breathes comfortably away from screen bezels.
- **Gutters & List Gaps:** `1rem` (16px) between product menu items and dual-column grid cards.
- **Vertical Hierarchy:**
  - `space-xs` (4px): Gap between product name and short ingredient subtitle.
  - `space-sm` (8px): Spacing inside input fields and badge pill padding.
  - `space-md` (16px): Internal container padding inside menu cards and input stacks.
  - `space-lg` (24px): Inter-section spacing between category lists and screen headers.
  - `space-xl` (32px): Primary separation above sticky bottom action bars and confirmation hero illustrations.

## Elevation & Depth

Visual depth is achieved through **Warm Ambient Layers** and **Subtle Crema Tints** rather than harsh cold drop shadows.

- **Canvas (Level 0):** Pure Steamed Milk Cream background (`#FDFBF7`).
- **Level 1 (Card & Content Blocks):** Soft off-white cards (`#FFFFFF`) with a diffuse warm ambient shadow: `box-shadow: 0 4px 16px -2px rgba(43, 26, 19, 0.06);` and a faint border stroke (`#EFE8DE`).
- **Level 2 (Active Elements & Modals):** Floating bottom navigation bars and sheets use `box-shadow: 0 8px 24px -4px rgba(43, 26, 19, 0.12);` along with subtle backdrop blur.
- **Level 3 (Primary CTAs & Floating Action Buttons):** Subtle caramel-tinted lift: `box-shadow: 0 6px 18px rgba(200, 125, 50, 0.28);`.

## Shapes

The interface embraces organic, comfortable roundness (`level 2`) reminiscent of ceramic café tableware and soft pastries.

- **Buttons & Large CTAs:** Generous 1rem to full pill geometry for tactile, touch-friendly tapping.
- **Menu Item Cards:** 1rem (`rounded-lg`) corner radii for structured presentation with soft perimeter curves.
- **Input Fields & Form Containers:** 0.75rem to 1rem radii with consistent border weights.
- **Badges & Price Tags:** Fully rounded pill shapes (`9999px`) for compact contrast against food and drink imagery.

## Components

### Buttons
- **Primary Action (Dark Espresso):** Solid `#2B1A13` fill, crisp white `#FFFFFF` text, `48px` minimum height, rounded 1rem corners, full-width on mobile viewports.
- **Secondary Action (Warm Caramel):** Solid `#C87D32` fill with white text, utilized for checkout, reorder, and primary positive actions.
- **Ghost / Outlined:** Transparent background, `1.5px` border in `#2B1A13` or `#EFE8DE`, used for secondary actions like secondary authentication switches.

### Food & Beverage Cards
- **Structure:** Horizontal layout for scrollable menu lists (like Home screen 5) and vertical 2-column cards for specials.
- **Thumbnail:** Square `72px x 72px` or `80px x 80px` rounded image block with warm background placeholder (`#F5EDE3`).
- **Content Block:** Item title (`title-md`), ingredient line (`body-sm` in `#6E584E`), and an integrated price badge (`#C87D32` text or matcha accent pill).
- **Interactive State:** Quick-add "+" stepper button nestled in the bottom right corner.

### Form Inputs
- **Text Inputs:** Light cream container (`#FFFFFF`), `1.5px` subtle border (`#EFE8DE`), focused border in `#C87D32` with an ambient caramel focus glow. Labels positioned directly above inputs with `label-lg` styling.

### Bottom Navigation Bar
- **Bar Frame:** Elevated white container with top border `#EFE8DE` and curved top edge (`rounded-t-2xl`).
- **Tab Items:** 3-item layout (Home, Order, Profile). Inactive icons in `#8C7A70`; active icon enclosed in a pill indicator or highlighted with `#C87D32` and active label.

### Status Badges & Confirmation Screens
- **Confirmation Hero:** Large circular badge (`80px x 80px`) filled with soft matcha mist (`#EAF3EE`), displaying a deep matcha green (`#3E7B5C`) checkmark icon.
- **Confirmation CTA:** Full-width Espresso button ensuring confident closure of the ordering loop.

### Assets Path
`MiniKafe/app/src/main/res/drawable/`
- Logo: minikafe-logo-16.png, minikafe-logo-32.png, minikafe-logo-64.png, minikafe-logo.svg
- Menu 1: cappuccino.jpg
- Menu 2: matcha-latte.jpg
- Menu 3: coffee-latte.jpg
- Menu 4: chocolate-donut.jpg
- Menu 5: sourdough.jpg 
