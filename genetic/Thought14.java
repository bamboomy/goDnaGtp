package genetic;
import java.util.ArrayList;
class Thought14 extends Thought{
private static ArrayList<Thought14> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 777.7944135602828;
private double fd1 = 197.78290716654104;
private Thought fo0 = null;
private Thought fo1 = null;
Thought14 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought14 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought14 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought14 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought14 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    Output.points[1][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 639.5826948061031;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 892.6067795312915;
    ld0 = fd0 - fd1;
    double ld1 = 289.5637731987279;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2();
}
    ld1 = fd0 - fd1;
    double ld3 = 761.0172842648097;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, ld3, fd0, fb0, fb1, lb2, ab1);
}
    fd1 *= -1;
    ab2 = !ab3;
    boolean lb4 = false;
    ab3 = ab4 || fb0;
    boolean lb5 = true;
    if (fb0) {
        if (fb1) {
            } else {
            lb2 = !lb4;
if(fo1 != null){
                          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              lb5 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, ld3, fd0, ab1, ab2, ab3, ab4);
}
            fb0 = fb1 && lb2;
            lb4 = lb5 || ab1;
            fd1 *= -1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought76.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld2 = 396.8769859997212;
    ab4 = fb0 && fb1;
    lb0 = !ab1;
    Thought lo3 = Thought61.getInstance(ab2, ab3, ab4, fb0);
    Output.points[1][8] -= ad4;
if(fo1 != null){
      fo1.m3();
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
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought22.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought33.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      ao1.m1();
}
    if (fb0) {
        double ld2 = 638.5046723792764;
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb3 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, fb0, fb1, lb3, fb0);
}
        fd0 = fd1 + ld2;
        fd0 = fd1 - ld2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb3, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
if(ao3 != null){
      fd0 = ao3.m3(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    if (fb1) {
if(ao4 != null){
          ao4.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Thought lo0 = Thought38.getInstance(ao1, ao2, ao3, ao4);
    double ld1 = 165.6217051346717;
    double ld2 = 200.80816430571065;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
    boolean lb3 = false;
    ab2 = ab3 && ab4;
    ld2 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb3, ab1);
}
    Output.points[2][0] -= ld1;
    ld2 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(ld1, ld2, fd0, fd1);
}
    double ld4 = 715.6013089808287;
    boolean lb5 = false;
    boolean lb6 = true;

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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    double ld1 = 81.22836311438554;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m2(lb0, ab1, ab2, ab3);
}
    double ld2 = 903.6467407160468;
    ld2 = ad1 - ad2;
    if (ab4) {
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ao3.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
        ab2 = ab3 || ab4;
        fb0 = ld1 > ld2;
        fb1 = ad1 > ad2;
        Thought lo3 = Thought27.getInstance(ao4, fo0, fo1, ao1);
        lb0 = !ab1;
        Thought lo4 = Thought98.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
        boolean lb5 = true;
        boolean lb6 = false;
        boolean lb7 = false;
        boolean lb8 = true;
        ab2 = !ab3;
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
    fb1 = !fb0;
    double ld0 = 737.8108312874892;
    fb1 = fb0 || fb1;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld1 = 894.8190544846501;
    double ld2 = 318.80247774744646;
if(fo0 != null){
      ld1 = fo0.m3();
}
    Output.points[2][1] += ld2;
    fd0 *= -1;
    fb1 = fd1 < ld0;
    ld1 = ld2 + fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, ld1, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
    ld1 *= -1;
    double ld3 = 50.84362670214154;

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
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 734.8512533854914;
    boolean lb1 = false;
    Output.points[2][2] -= ld0;
    fd0 *= -1;
if(fo0 != null){
      ab4 = fo0.m2();
}
    double ld2 = 292.5104982015469;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld0);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb1);
}
    ab1 = ld2 < fd0;
    fd1 = ld0 - ld2;

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
if(fo0 != null){
      ad1 = fo0.m3();
}
    Thought lo0 = Thought13.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        }
    Thought lo1 = Thought74.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 + fd0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought96.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][3] += ad2;
    ad3 = ad4 + fd0;
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        boolean lb1 = true;
        Thought lo2 = Thought13.getInstance(ab2, ab3, ab4, fb0);
        ad3 *= -1;
        fb1 = !lb1;
if(fo1 != null){
          lb0 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad2 *= -1;
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(lb0, lb1, fb0, fb1);
}
    lb0 = fd0 < fd1;
    boolean lb2 = false;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[2][4] -= fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    lb0 = lb1 && lb2;
    fb0 = !fb1;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
    Output.points[2][5] += ad3;
    double ld0 = 826.8288565088035;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought99.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        fd0 = fd1 - ld0;
        fb0 = ad1 > ad2;
        Thought lo2 = Thought15.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        fb1 = !fb0;
        fb1 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
        double ld3 = 26.85298886426091;
        ad3 = ad4 + fd0;
        Thought lo4 = Thought34.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
          ao3 = ao4.m4();
}
        Output.points[2][6] -= fd1;
        boolean lb5 = false;
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
    boolean lb0 = true;
    Output.points[2][7] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld1 = 61.51172877657802;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || lb0;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
    if (ab3) {
if(fo1 != null){
          ab4 = fo1.m2(fd0, fd1, ld1, fd0);
}
        fb0 = fd1 > ld1;
        if (fb1) {
            fd0 = fd1 + ld1;
            lb0 = ab1 || ab2;
if(ao1 != null){
              fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
}}
Thought.STACK_COUNTER++;
return ab3;
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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ad1;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb1, ab1);
}
    ab2 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ab3 = ad4 < fd0;
    ab4 = fd1 < ad1;
    Output.points[2][8] -= ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;

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
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    Output.points[3][0] += fd1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought84.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    fd0 = fd1 + fd0;
    Thought lo4 = Thought2.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd1 < fd0;
    fb1 = !lb0;

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
    fd0 = fd1 + fd0;
    double ld0 = 666.3871888344582;
    Thought lo1 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
    Output.points[3][1] -= fd1;
    ld0 = fd0 + fd1;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab2 = ab3 && ab4;
        boolean lb2 = true;

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
    fb0 = ad1 > ad2;
    Thought lo0 = Thought40.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought93.getInstance();
    ad3 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb2, fb0);
}
    Output.points[3][2] -= ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb2 = !fb0;
    fb1 = ad2 > ad3;
    lb2 = ad4 < fd0;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    lb2 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
}
    fb0 = ad4 < fd0;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
    Thought lo5 = Thought15.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      ad2 = fo1.m3(lb4, fb0, fb1, lb2);
}

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    ab2 = ab3 || ab4;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 92.49468377005724;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought86.getInstance(fd0, fd1, ld0, ad1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = fb0 || fb1;
    boolean lb2 = false;
    Thought lo3 = Thought75.getInstance();
    lb2 = ab1 && ab2;
    ld0 *= -1;
    ad1 *= -1;
    ab3 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb2);
}
    ab1 = ad2 > ad3;
    Thought lo4 = Thought6.getInstance(fo1, fo0, fo1, fo0);
    Output.points[3][3] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;

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
    double ld0 = 332.28715514961283;
    fb0 = !fb1;
    ld0 = fd0 + fd1;
    fb0 = !fb1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 > ld0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought23.getInstance(fb0, fb1, fb0, fb1);
    Thought lo2 = Thought96.getInstance();
    fb0 = !fb1;
    Thought lo3 = Thought49.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    lb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[3][4] += ad1;
    fb1 = lb0 && fb0;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    double ld1 = 268.9893754237186;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld1);
}
    boolean lb2 = false;
    Thought lo3 = Thought62.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    boolean lb4 = true;
if(ao1 != null){
      lb0 = ao1.m2(lb2, lb4, fb0, fb1);
}
    double ld5 = 187.81959010607102;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 *= -1;
    lb0 = fd0 > fd1;
    lb2 = !lb4;
    ld1 = ld5 - ad1;
    ad2 = ad3 - ad4;
    boolean lb6 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought74.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[3][5] += fd0;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought19.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fd1 = fd0 + fd1;
    Output.points[3][6] -= fd0;
    Thought lo3 = Thought45.getInstance(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
    ab3 = fd1 < fd0;
    Thought lo4 = Thought80.getInstance(fd1, fd0, fd1, fd0);
    boolean lb5 = true;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    boolean lb6 = true;
    boolean lb7 = false;
if(ao3 != null){
      ao3.m3(ab1, ab2, ab3, ab4);
}
    Thought lo8 = Thought94.getInstance();
        if (fb0) {
        fb1 = lb1 && lb5;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb6, lb7, ab1, ab2);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    Output.points[3][7] += ad1;
    double ld1 = 62.59599417307402;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought45.getInstance();
    double ld3 = 973.376243196133;
    ld1 = ld3 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
    ab1 = ld3 < ad1;
    boolean lb4 = true;
    ab1 = ab2 || ab3;
    boolean lb5 = false;
    double ld6 = 192.141948661657;
    ab3 = !ab4;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought71.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
    boolean lb2 = true;
    double ld3 = 545.5892435795207;
    lb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2();
}
    double ld5 = 204.50989378779857;
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld3, fb0, fb1, lb1, lb2);
}
    lb4 = ld5 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, ld5, fd0, lb1, lb2, lb4, fb0);
}
    Output.points[3][8] += fd1;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought5.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    Thought lo1 = Thought91.getInstance(fb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    double ld2 = 624.7913798384135;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld2;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ld2, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought33.getInstance(fd0, fd1, ld2, fd0);
        fd1 *= -1;
        fb0 = !fb1;
        Thought lo4 = Thought19.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
        boolean lb5 = true;
        lb5 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3();
}
if(fo1 != null){
          fd1 = fo1.m3(ld2, fd0, fd1, ld2, fb1, lb5, ab1, ab2);
}
        fd0 = fd1 - ld2;
        ab3 = !ab4;
        fd0 *= -1;
        boolean lb6 = true;
        ab4 = fb0 || fb1;
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        double ld1 = 511.27093611795465;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        }
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
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
if(ao1 != null){
      ao1.m2();
}
    Thought lo0 = Thought13.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 && fb0;
        fb1 = fd1 < fd0;
    if (fb0) {
        fb1 = fd1 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        Thought lo1 = Thought89.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
        fb0 = fd0 < fd1;
        Thought lo2 = Thought14.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        boolean lb3 = false;
        fd1 = fd0 - fd1;
        Thought lo4 = Thought28.getInstance();
        double ld5 = 31.84479408163908;
        for(int i0=0; i0<10; i0++){
            fb0 = fb1 || lb3;
}}
Thought.STACK_COUNTER++;
return ao1;
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
    Thought lo0 = Thought41.getInstance(ad1, ad2, ad3, ad4);
    double ld1 = 73.70065445846836;
    fb1 = ad4 < fd0;
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld1;
    fb1 = ad1 < ad2;
    boolean lb2 = true;
    Output.points[4][0] -= ad3;
    ad4 = fd0 + fd1;
    lb2 = fb0 && fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought49.getInstance();
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    ab2 = fd1 > fd0;
    double ld2 = 600.5606240479326;
if(ao1 != null){
      ao1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
    fd0 *= -1;
    lb1 = lb3 && ab1;
    ab2 = fd1 > ld2;

Thought.STACK_COUNTER++;
return ao2;
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
    ad2 = ad3 - ad4;
    double ld0 = 304.7128448857072;
    ab1 = ab2 && ab3;
    ab4 = ad4 < fd0;
    fd1 = ld0 - ad1;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    fd0 = fd1 + ld0;
    double ld3 = 926.1478116312795;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb1, lb2, ab1, ab2);
}
    boolean lb4 = false;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(ld0, ld3, ad1, ad2, ab3, ab4, fb0, fb1);
}
    double ld5 = 300.6249525834202;
    lb1 = ad2 < ad3;
if(ao4 != null){
      ad4 = ao4.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld3, ld5);
}
    boolean lb6 = false;
if(fo1 != null){
      fo1.m2(lb2, lb4, lb6, ab1);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}

Thought.STACK_COUNTER++;
return ao1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[4][1] += fd1;
    double ld0 = 927.1586144588802;
    ld0 = fd0 - fd1;
    fb1 = ld0 > fd0;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Output.points[4][2] -= fd0;
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2();
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
        Output.points[4][3] -= fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    double ld0 = 911.6720703316848;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;

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
