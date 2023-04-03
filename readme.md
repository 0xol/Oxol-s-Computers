## Todo list
- [x] register creative menu
- [x] item registration and defintion subsystem
- [ ] block registration and definiton subsystem
- [ ] add ultrakill reference
- [ ] simple rv32 emulation and hardware discovery
- [ ] add cpu tiers (clock speed and max connected hardware)
- [ ] add multiblock hardware registry (for multiblock computers/systems i.e networking and supercomputers)

## riscv isa implementation (implemented vs planned)
based on RISC-V Instruction Set Manual, Document Version 2.2 <br>
- [ ] rv32I
- [ ] M extension
- [ ] C extension

## how to add an item to the game
create a new file in src/main/kotlin/oxol/oxolscomputers/item/(item_name)Item.kt <br>
inside that file create a extended version of item class for the item <br>
create a name defintion in src/resources/assets/oxolscomputers/lang/en_us.json <br>
create a texture json in src/resources/assets/oxolscomputers/model/item/(item_name).json <br>
create a texture png in src/resources/assets/oxolscomputers/textures/item/(item_name).png