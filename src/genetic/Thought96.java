package genetic;
import java.util.ArrayList;
class Thought96 extends Thought{
private static ArrayList<Thought96> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 864.4144540694714;
private double fd1 = 753.6491903882601;
private Thought fo0 = null;
private Thought fo1 = null;
Thought96 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought96 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought96 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought96 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought96 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 133.34612656590332;
    fb1 = ld0 > fd0;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = fb0 && fb1;
        fb0 = fd1 > ld0;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        } else {
                fd1 *= -1;
        for(int i0=0; i0<10; i0++){
            fb1 = ld0 > fd0;
            fd1 = ld0 - fd0;
            Thought lo1 = Thought99.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
            fb0 = !fb1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
            double ld2 = 993.7274540365507;
            Output.points[5][3] -= ld2;
            fb0 = ld0 > fd0;
            fd1 = ld2 - ld0;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = fd1 < fd0;
    boolean lb0 = false;
    boolean lb1 = true;
        ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[5][4] -= fd1;
    Output.points[5][5] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought34.getInstance();
    boolean lb3 = false;
    double ld4 = 266.3451531846026;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld4, fd0, fd1, lb1, lb3, ab1, ab2);
}
    ld4 = fd0 - fd1;
    ab3 = ld4 > fd0;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    ld4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, lb0, lb1, lb3, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld4, fd0, fd1);
}
    Thought lo5 = Thought95.getInstance(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4);
    fd0 = fd1 - ld4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, lb3);
}
    double ld6 = 512.695548428539;
if(fo0 != null){
      fo0.m2();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 31.656766035566616;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Output.points[5][6] += ld0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought23.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    Thought lo3 = Thought36.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    fb1 = !lb1;
    Thought lo4 = Thought29.getInstance(fb0, fb1, lb1, fb0);
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = false;
    fb0 = fb1 || lb1;
    for(int i0=0; i0<10; i0++){
        if (lb5) {
            boolean lb6 = false;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    double ld0 = 714.7186593157427;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
        ab2 = ab3 || ab4;
    ld0 = ad1 - ad2;
    ad3 *= -1;
    fb0 = fb1 || ab1;
    boolean lb1 = false;
    boolean lb2 = false;
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, lb3, ab1, ab2);
}
    ab3 = ld0 < ad1;
    Thought lo4 = Thought92.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
    ad2 *= -1;
    boolean lb5 = false;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[5][7] -= fd0;
    Output.points[5][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, lb5, ab1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = fd1 < fd0;
    fb0 = fb1 && lb0;
    lb1 = fd1 < fd0;
    double ld2 = 566.7222281835938;
    fd0 = fd1 + ld2;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    fd1 = ld2 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fd1, ld2, fd0, fd1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2);
}
    lb3 = fd0 > fd1;
    Thought lo4 = Thought95.getInstance(fb0, fb1, lb0, lb1);
    double ld5 = 980.9433375693043;
if(fo0 != null){
      fo0.m1();
}
    lb3 = ld2 < ld5;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[6][0] += fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld0 = 83.1183641982323;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1();
}
    boolean lb0 = true;
if(ao3 != null){
      ab1 = ao3.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    lb0 = ab1 && ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        double ld1 = 552.3548884834395;
        fd0 = fd1 + ld1;
        Thought lo2 = Thought83.getInstance(fd0, fd1, ld1, fd0);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ab2 = ad4 > fd0;
    double ld0 = 50.282907773376394;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought12.getInstance(ab3, ab4, fb0, fb1);
if(ao1 != null){
      ab1 = ao1.m2();
}
    Thought lo2 = Thought58.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fd1 = ld0 - ad1;
    Thought lo3 = Thought75.getInstance(ao2, ao3, ao4, fo0);
    boolean lb4 = true;
    fb0 = !fb1;
    boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb4, lb5, ab1, ab2);
}
    fd1 = ld0 + ad1;
    ad2 = ad3 + ad4;
    ab3 = fd0 < fd1;
    ab4 = fb0 && fb1;
    lb4 = lb5 && ab1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[6][1] -= ld0;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
        ad2 *= -1;
        Thought lo6 = Thought74.getInstance(lb4, lb5, ab1, ab2);
        boolean lb7 = false;
        boolean lb8 = true;
if(ao2 != null){
          ad3 = ao2.m3();
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 658.659478432799;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 = fd0 + fd1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
        fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought40.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought27.getInstance(ld0, fd0, fd1, ld0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    double ld0 = 241.52418227159603;
    Thought lo1 = Thought79.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld2 = 463.1855939079343;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
}
    ld0 = ld2 + fd0;
    ab1 = ab2 && ab3;
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
    double ld4 = 999.4979882648804;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb3);
}
    ld4 *= -1;
    ab1 = ab2 && ab3;
    Thought lo5 = Thought72.getInstance();
    ab4 = fd0 > fd1;
    Output.points[6][2] -= ld0;
    fb0 = fb1 && lb3;
    ld2 *= -1;
    ab1 = ld4 < fd0;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        Output.points[6][3] -= fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        if (fb0) {
if(fo1 != null){
              fo1.m1(fd0, fd1, ad1, ad2);
}
            ad3 = ad4 - fd0;
            Thought lo0 = Thought26.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = fd1 < ad1;
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ab2 = ad1 > ad2;
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ad3 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        Output.points[6][4] += fd0;
        Thought lo0 = Thought20.getInstance(ab3, ab4, fb0, fb1);
        fd1 *= -1;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad1 = ad2 - ad3;
        }
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    double ld2 = 339.0681766803376;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    double ld0 = 111.10096626956783;
    boolean lb1 = true;
    fb0 = fd0 < fd1;
    Thought lo2 = Thought35.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
    boolean lb3 = false;
    Thought lo4 = Thought97.getInstance(fo0, fo1, ao1, ao2, lb1, lb3, fb0, fb1);
    fd0 = fd1 - ld0;
    boolean lb5 = true;
    Thought lo6 = Thought45.getInstance(fd0, fd1, ld0, fd0);
    lb1 = lb3 || lb5;
    fb0 = fd1 > ld0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = fb0 && fb1;
    Output.points[6][5] += fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    fb1 = ad1 > ad2;
    lb0 = !fb0;
    Thought lo1 = Thought54.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    lb0 = ad1 < ad2;
    Thought lo2 = Thought21.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    boolean lb3 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb3);
}
    Thought lo4 = Thought99.getInstance(ad2, ad3, ad4, fd0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = ab1 || ab2;
    double ld0 = 881.5706889185798;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    ld0 = fd0 + fd1;
    Output.points[6][6] -= ld0;
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, ab1, ab2, ab3);
}
    double ld2 = 848.0594381193141;
    double ld3 = 554.7603979591374;
    ab4 = ld2 < ld3;
    fb0 = fb1 && lb1;
    fd0 *= -1;
    boolean lb4 = false;
    Output.points[6][7] += fd1;
    lb4 = !ab1;
    ab2 = ab3 && ab4;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld2, ld3, fd0);
}
        boolean lb5 = true;
        fb0 = fd1 < ld0;
}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 || lb0;
if(ao4 != null){
      ao4.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[6][8] -= fd1;
    boolean lb1 = true;
    ad1 *= -1;
    lb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    ab1 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    ad2 *= -1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2();
}
        fd1 *= -1;
        fd0 = fd1 + fd0;
        boolean lb0 = true;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 && lb0;
            Output.points[7][0] -= fd0;
            fb0 = fd1 > fd0;
}}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    double ld0 = 476.46607229301577;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Output.points[7][1] -= ld0;
    double ld1 = 513.4693765123179;
    ld1 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, fd0, fd1, ld0);
}
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    ad3 *= -1;
    Thought lo1 = Thought76.getInstance();
    fb1 = ad4 < fd0;
        fd1 *= -1;
    ad1 = ad2 + ad3;
    lb0 = fb0 || fb1;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        }
    ab1 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ad2 = ad3 - ad4;
    ab2 = ab3 || ab4;
        fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    double ld1 = 814.607500162071;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought10.getInstance(fb0, fb1, lb0, fb0);
        fb1 = lb0 || fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Output.points[7][2] -= ad4;
    Thought lo0 = Thought24.getInstance(fd0, fd1, ad1, ad2);
        Output.points[7][3] += ad3;
    fb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
if(ao3 != null){
      ad4 = ao3.m3();
}
    Output.points[7][4] -= fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 38.77334149420488;
    Thought lo1 = Thought58.getInstance(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought27.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0);
}
    Thought lo3 = Thought6.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
    Thought lo4 = Thought56.getInstance(ab2, ab3, ab4, fb0);
    double ld5 = 652.7951281149412;
    fd0 = fd1 + ld0;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;

Thought.STACK_COUNTER++;
return ld5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ao3.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought98.getInstance(ao4, fo0, fo1, ao1);
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ab1 = ad2 > ad3;
    double ld2 = 522.0328107902927;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = ad1 < ad2;
    ab4 = !fb0;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Thought lo0 = Thought63.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought16.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
    Output.points[7][5] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought91.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    lb3 = fb0 && fb1;
    fd1 = fd0 + fd1;
    Thought lo4 = Thought19.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    lb3 = !fb0;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Output.points[7][6] -= fd1;
    fd0 = fd1 - fd0;
    lb0 = ab1 || ab2;
    boolean lb1 = true;
    fd1 *= -1;
    ab2 = ab3 && ab4;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        double ld3 = 768.1667939120013;
        boolean lb4 = false;
if(fo0 != null){
          fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][7] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought50.getInstance(ad3, ad4, fd0, fd1);
    Output.points[7][8] += ad1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    Thought lo3 = Thought98.getInstance();
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = !ab2;
    Output.points[8][0] -= ad2;
    Thought lo1 = Thought50.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    boolean lb2 = false;
    if (lb0) {
        ad3 = ad4 - fd0;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        lb0 = !lb2;
        ab1 = ad4 > fd0;
        fd1 = ad1 - ad2;
        ab2 = ab3 || ab4;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought8.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought35.getInstance(fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    Output.points[8][1] += fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo2 = Thought41.getInstance(ao2, ao3, ao4, fo0);

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    double ld0 = 750.1123295910002;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought34.getInstance(ad4, fd0, fd1, ld0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought5.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        fb0 = ad1 > ad2;
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        Thought lo3 = Thought98.getInstance(ad3, ad4, fd0, fd1);
        fb0 = ld0 < ad1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
if(ao2 != null){
      ad4 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3();
}
    fb1 = !lb0;
    fd0 = fd1 + ad1;
    ab1 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = ab1 || ab2;
    ab3 = ad1 > ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought32.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    Thought lo3 = Thought57.getInstance();
    Thought lo4 = Thought10.getInstance(ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][2] += fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld0 = 377.0144038809434;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld1 = 130.53724961902094;
    ld0 = ld1 + fd0;
    fb1 = fd1 > ld0;
    ld1 = fd0 + fd1;
    ld0 = ld1 - fd0;
    Output.points[8][3] += fd1;
    fb0 = ld0 > ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Output.points[8][4] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought48.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    Thought lo2 = Thought70.getInstance();
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    Output.points[8][5] += fd0;
    Output.points[8][6] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought13.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
    boolean lb4 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3();
}
    fd0 *= -1;
    lb1 = !fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
