package se.pkg1.pkgx;

import third.party.SomeClassThirdParty;

import se.pkg1.pkgnotx.SomeClassY1;

import se.pkg1.pkgx.SomeClassX1;
import se.pkg1.pkgx.SomeClassX2;

class HelloWorld {
  public static void main(String[] args) {
    SomeClassThirdParty someClassThirdParty = new SomeClassThirdParty();
    someClassThirdParty.noOp();
    SomeClassY1 someClassY1 = new SomeClassY1();
    someClassY1.noOp();
    SomeClassX1 someClassX1 = new SomeClassX1();
    someClassX1.noOp();
    SomeClassX2 someClassX2 = new SomeClassX2();
    someClassX2.noOp();
  }
}