# Changelog

Satan's Deco: Bars Mayhem - later on - Project

All notable changes to Project will be documented in this file.

The format is based on [Low Cortisol Changelog 0.1.0] guideline.

Implements following modifications:
 1) Project also known as: mod. 
 2) For Added category references can be omitted.
 3) Version entry can be signed as [partitioning] if it was a part of different project before. 

Implements following subcategories in order:
 1) Unclassified
 2) Game Mechanics 
 3) Blocks & Items
 4) Textures & Models

Project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Planned]
### Added
- [since partitioning] Add Kazakh (kk_kz) translation
- [since partitioning] Add Polish (pl_pl) translation
- [since partitioning] Add Russian (ru_ru) translation
- [since partitioning] Add Ukrainian (uk_ua) translation
- [since partitioning] Add Portuguese (pt_pt) translation

### Changes
- [since partitioning] Optimize datagen
- [since 1.0.0] **probably breaking** Change naming of [curtain_default_COLOR] to [curtain_COLOR]
- [since 1.0.0] **probably breaking** Change naming of [curtain_COLOR] to [curtain_edge_trim_COLOR] 

### Fixes
- [since 0.3.0] Fix Block properties bloat


## [1.0.0] - 2026-07-23
### Added
- Add Spanish (es_es) translation ([ee6e110](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/ee6e1101300238c7720ae4b28f54c884fdf8fba6))
- Add German (de_de) translation ([ee6e110](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/ee6e1101300238c7720ae4b28f54c884fdf8fba6))
- Add French (fr_fr) translation ([ee6e110](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/ee6e1101300238c7720ae4b28f54c884fdf8fba6))
- Port to 1.21.1 ([master-1.21.1](https://github.com/kittysatanicbelyah/satans_deco_ci/tree/master-1.21.1))

### Changes
#### Unclassified
- Remake banner and move all banners to another repo ([7eadf3a](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/7eadf3a0ef8b7868bcf7959e3bc9ef352dd731eb))
- Revamp README.md ([7eadf3a](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/7eadf3a0ef8b7868bcf7959e3bc9ef352dd731eb))
#### Game Mechanics
- Change display of pelmets so bars_SIDE and SIDE can display simultaneously ([ee6e110](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/ee6e1101300238c7720ae4b28f54c884fdf8fba6))

### Fixes
- Fix incorrect recipes ([82f8118](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/82f8118cc23ab03842335926dbb30be82e4f9ec3))
- Fix incorrect tag ([82f8118](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/82f8118cc23ab03842335926dbb30be82e4f9ec3))
- Add missing cherry and mangrove to pelmets/solids/wood tag ([82f8118](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/82f8118cc23ab03842335926dbb30be82e4f9ec3))

### Removed
- Remove SupportedModWood as no use for it ([5f2a6d3](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/5f2a6d3cdf85a7259baf160ef2b1834a556c7ad1))


## [0.4.0] - 2026-07-11
### Added
#### Game Mechanics
- Add tags for Pelmets ([676a028](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/676a0281e86b08160e1c81d58da4c808270eb736), [64e4c56](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/64e4c56d658af4088538fc4244bc4dccee35e3ce))
- Add CISupGen ([676a028](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/676a0281e86b08160e1c81d58da4c808270eb736)
#### Blocks & Items
- Add Pelmet blocks ([6ff40e4](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/6ff40e4dd986776244e5d4cfc8421e07bd15ae6a), [676a028](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/676a0281e86b08160e1c81d58da4c808270eb736))
#### Textures & Models
- Add textures and models for Pelmets  ([f7e5707](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/f7e5707522beac8771891b4acc5113bc2171d774))

## [0.3.0] - 2026-06-29
### Added
#### Blocks & Items
- Add Blinds ([22da6b5](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/22da6b594d4e28e3513e302ff1e136f35078bf6d))
- Add Beaded Curtains ([22da6b5](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/22da6b594d4e28e3513e302ff1e136f35078bf6d))
- Add Default Curtains ([22da6b5](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/22da6b594d4e28e3513e302ff1e136f35078bf6d))
#### Textures & Models
- Textures for new curtain types ([d5ff847](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/d5ff847cb049d08b4d34fff7ae4e79a01bae249f))

### Changed
#### Game Mechanics
- Split TemplateCurtainBlock into TemplateCurtainBlock (used by blinds) and ThreePositionsCurtainBlock for optimization ([22da6b5](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/22da6b594d4e28e3513e302ff1e136f35078bf6d))
- Change crafting recipes for Edge Trim Curtains ([22da6b5](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/22da6b594d4e28e3513e302ff1e136f35078bf6d))
#### Blocks & Items
- Change name of Curtains to Edge Trim Curtains ([22da6b5](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/22da6b594d4e28e3513e302ff1e136f35078bf6d))


 ## [0.2.0] - 2026-06-21
### Added
- Add Sound Events and subtitles for opening and closing of curtains ([e135be9](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/e135be9f4aa8b514358bcf69c9d5464c0473d217))
- Publish on Curseforge ([satans-deco-ci](https://www.curseforge.com/minecraft/mc-mods/satans-deco-ci))
- Add Logo ([e135be9](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/e135be9f4aa8b514358bcf69c9d5464c0473d217))

## Fixes
- Fix redstone power incorrect work on curtains ([e135be9](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/e135be9f4aa8b514358bcf69c9d5464c0473d217))
- Fix translation keys of curtains ([e135be9](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/e135be9f4aa8b514358bcf69c9d5464c0473d217))
- Fix curtains requiring correct tool to break ([e135be9](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/e135be9f4aa8b514358bcf69c9d5464c0473d217))
- Fix curtains being uncraftable ([e135be9](https://github.com/kittysatanicbelyah/satans_deco_ci/commit/e135be9f4aa8b514358bcf69c9d5464c0473d217))

 ## [0.1.0] - 2026-06-15
_Initial Release_

 ## [partitioning] - 2026-06-15
_Partition from Satan's deco: Bars Mayhem_

