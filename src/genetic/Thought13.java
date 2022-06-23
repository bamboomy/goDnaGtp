package genetic;
import java.util.ArrayList;
class Thought13 extends Thought{
private static ArrayList<Thought13> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 415.1083698229683;
private double fd1 = 612.9928211042345;
private Thought fo0 = null;
private Thought fo1 = null;
Thought13 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought13 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought13 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought13 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought13 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought13 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought13 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought13 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought13 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
    Thought lo0 = Thought15.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = !fb1;
    double ld2 = 350.25670573914425;
    boolean lb3 = false;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0, lb1, lb3, fb0, fb1);
}
    lb1 = !lb3;
    Thought lo4 = Thought0.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb1, lb3);
}
    fb0 = ld2 > fd0;

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        lb0 = !lb1;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m2();
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        fd0 = fd1 + fd0;
        lb0 = lb1 || ab1;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    double ld1 = 878.8402336931096;
    fb0 = ad3 < ad4;
    Output.points[7][2] -= fd0;
    fd1 = ld1 - ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2();
}
    fb0 = !fb1;
    Output.points[7][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    double ld2 = 817.5206881188748;
    fb0 = fb1 || lb0;
    ad3 = ad4 - fd0;
        fd1 = ld1 + ld2;

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
    ad1 = ad2 - ad3;
    Output.points[7][4] -= ad4;
    Thought lo0 = Thought3.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 929.9262533964461;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    ab4 = ad4 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld1, ad1, ad2);
}
    Thought lo2 = Thought22.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    double ld3 = 843.9778867706474;
    fb1 = ab1 || ab2;

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
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought21.getInstance();
    Thought lo1 = Thought35.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld2 = 777.9094794187042;
    for(int i0=0; i0<10; i0++){
        ld2 *= -1;
        double ld3 = 492.94686661628714;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        Output.points[7][5] += ld2;
        boolean lb4 = true;
        double ld5 = 467.3198872043493;
        fb0 = ld2 > fd0;
        boolean lb6 = false;
        fd1 *= -1;
        fb0 = fb1 && lb4;
        Output.points[7][6] -= ld3;
if(ao1 != null){
          ld5 = ao1.m3(ld2, fd0, fd1, ld3);
}
if(ao2 != null){
          ld5 = ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld3);
}
        lb6 = fb0 && fb1;
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
    Output.points[7][7] -= ad2;
    double ld0 = 554.7394537915377;
    double ld1 = 908.6482734517147;
    boolean lb2 = true;
    Thought lo3 = Thought82.getInstance(lb2, fb0, fb1, lb2);
    Thought lo4 = Thought69.getInstance();
    Thought lo5 = Thought73.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
        boolean lb6 = false;
        double ld7 = 434.8782973223699;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
        double ld8 = 19.38251264775216;
        fb1 = ld8 > ld0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, lb6, lb2, fb0, fb1);
}
        boolean lb9 = true;
        }
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb2);
}
    Thought lo10 = Thought68.getInstance(fd1, ld0, ld1, ad1);
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    ld1 *= -1;
    double ld11 = 64.87586105394121;

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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2();
}
    Output.points[7][8] -= fd0;
    Thought lo0 = Thought68.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
    Output.points[8][0] += fd0;
    boolean lb1 = true;
        boolean lb2 = false;
    lb2 = fd1 > fd0;
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb1;
    boolean lb3 = true;

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
    Output.points[8][1] -= ad2;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m1();
}
    Output.points[8][2] -= ad1;
    ab1 = ad2 < ad3;
    Output.points[8][3] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    ad3 *= -1;
    fb1 = ab1 || ab2;
    double ld0 = 708.0639216903676;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}
    fb1 = ab1 || ab2;
    Thought lo1 = Thought91.getInstance(ab3, ab4, fb0, fb1);
    ad1 = ad2 + ad3;
if(ao4 != null){
      ad4 = ao4.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ad3 *= -1;
    ab4 = fb0 || fb1;
    lb2 = ab1 || ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad4 *= -1;
    boolean lb3 = false;
    ab2 = ab3 || ab4;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
    Output.points[8][4] += fd1;
    double ld1 = 222.97665849650414;
    ld1 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    Thought lo2 = Thought64.getInstance(fb0, fb1, lb0, fb0);

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
    Output.points[8][5] += fd0;
    Output.points[8][6] -= fd1;
    boolean lb0 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    double ld2 = 590.3816741476431;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
    double ld3 = 204.92355736683805;
    ld2 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld2);
}
    ld3 = fd0 - fd1;
    ld2 = ld3 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
}
    lb0 = !lb1;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return lb4;
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
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 479.08992344571425;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld1 = 214.48927286772968;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fb1 = ld0 > ld1;
    Thought lo2 = Thought23.getInstance(fo1, fo0, fo1, fo0);
    ad1 *= -1;
    boolean lb3 = false;
    lb3 = ad2 < ad3;
    if (fb0) {
        fb1 = lb3 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
        Output.points[8][7] += ad1;
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1);
}
        boolean lb4 = true;
        double ld5 = 533.1790086168231;
        fb0 = ad1 > ad2;
        double ld6 = 800.8597148450217;
}
Thought.STACK_COUNTER++;
return lb3;
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
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 969.2461132432653;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, lb1, lb2, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    if (fb1) {
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought32.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    double ld1 = 154.00121057461163;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, fd0, fd1);
}
    Output.points[8][8] -= ld1;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought68.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
    fd1 = ld1 - fd0;
    Thought lo3 = Thought90.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld4 = 342.6820406281702;
    fb0 = !fb1;
    fb0 = fd0 > fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    fb0 = fb1 && fb0;
    ad2 *= -1;
    double ld0 = 624.2306735215553;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 405.2182807013302;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ld1, ad1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    ld1 = ad1 - ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(ao4 != null){
      fb0 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}

Thought.STACK_COUNTER++;
return lb2;
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
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought67.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought78.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
        ab2 = ab3 && ab4;
        fb0 = fb1 && lb0;
        double ld3 = 977.171926327728;
        }
    ab1 = ab2 && ab3;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought36.getInstance(ab4, fb0, fb1, lb0);
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Output.points[0][0] -= ad2;
    Thought lo0 = Thought88.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ab3 = ad4 > fd0;
    ab4 = fd1 > ad1;
    boolean lb1 = false;
    ab4 = fb0 || fb1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    lb1 = fd1 > ad1;
    ab1 = !ab2;
    boolean lb2 = false;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ab2 = ao4.m2(fd0, fd1, ad1, ad2);
}
    ab3 = ad3 > ad4;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}

Thought.STACK_COUNTER++;
return ab4;
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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    Output.points[0][1] -= fd0;
    fd1 = fd0 - fd1;
    if (fb1) {
if(fo0 != null){
          fo0.m3();
}
        Thought lo1 = Thought44.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
        Output.points[0][2] += fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 489.64461498007717;
    ld0 *= -1;
    double ld1 = 853.1575192260999;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    fd0 *= -1;
    fd1 = ld0 + ld1;
    fd0 = fd1 + ld0;
    ld1 = fd0 - fd1;
    boolean lb2 = true;
    ab4 = ld0 < ld1;
    Thought lo3 = Thought16.getInstance(fb0, fb1, lb2, ab1);
if(fo1 != null){
      fo1.m3();
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    boolean lb0 = true;
    Thought lo1 = Thought9.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        lb0 = ad3 > ad4;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ad1 = fo0.m3(fb1, lb0, fb0, fb1);
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          fd0 = fo1.m3();
}
        fd1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}

Thought.STACK_COUNTER++;
return ad1;
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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought42.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][3] -= ad4;
    boolean lb1 = false;
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
        Thought lo2 = Thought65.getInstance(ad4, fd0, fd1, ad1);
        ab2 = ab3 || ab4;
        double ld3 = 426.993701009626;
        if (fb0) {
            ad1 *= -1;
            fb1 = lb1 && ab1;
            Thought lo4 = Thought72.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
            fd1 = ld3 + ad1;
if(fo0 != null){
              ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
            ad2 = ad3 + ad4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought1.getInstance();
    boolean lb1 = true;
    double ld2 = 22.47480850025623;
    boolean lb3 = true;
if(ao2 != null){
      ao2.m3(ld2, fd0, fd1, ld2, lb1, lb3, fb0, fb1);
}
    lb1 = lb3 || fb0;
    fb1 = lb1 || lb3;
    fd0 *= -1;
    double ld4 = 119.2525635972352;
    for(int i0=0; i0<10; i0++){
        Output.points[0][4] += fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, ld4, fd0, fb0, fb1, lb1, lb3);
}
        }
    fb0 = fb1 || lb1;
    fd1 = ld2 + ld4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb1);
}
    Thought lo5 = Thought60.getInstance(fd0, fd1, ld2, ld4);
    lb3 = !fb0;
    fb1 = lb1 && lb3;
    fb0 = fd0 < fd1;
    fb1 = lb1 || lb3;
    fb0 = !fb1;
    Output.points[0][5] += ld2;

Thought.STACK_COUNTER++;
return ld4;
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
    fb0 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        fb1 = ad3 < ad4;
        fd0 = fd1 + ad1;
        Thought lo0 = Thought77.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
        Thought lo1 = Thought84.getInstance(fb0, fb1, fb0, fb1);
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 *= -1;
        fb0 = fb1 || fb0;
        double ld2 = 854.1042984663874;
if(ao2 != null){
          ao1 = ao2.m4(ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fd0 *= -1;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, fb1, fb0, fb1, fb0);
}
        boolean lb3 = false;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought98.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    double ld1 = 134.60875188086985;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1);
}
        fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fb1, ab1, ab2, ab3);
}
    Output.points[0][6] += ld1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 *= -1;
    fd1 = ld1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    double ld2 = 795.4297353858303;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought31.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, ld2);
}
    double ld4 = 763.5836585341129;

Thought.STACK_COUNTER++;
return ld4;
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
    Thought lo0 = Thought85.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = false;
if(ao3 != null){
      ao3.m1(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          ao1.m2(fd0, fd1, ad1, ad2);
}
        fb0 = ad3 > ad4;
        fb1 = fd0 < fd1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld2 = 765.259693988802;
        ad4 *= -1;
        fd0 = fd1 + ld2;
        ad1 = ad2 - ad3;
        lb1 = ab1 && ab2;
if(ao1 != null){
          ad4 = ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          lb1 = ao2.m2();
}
        Output.points[0][7] -= fd0;
}
Thought.STACK_COUNTER++;
return ad1;
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 409.13026414004844;
    fb0 = !fb1;
    double ld1 = 181.02751735407716;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
    fb0 = !fb1;
    double ld2 = 741.3349284783617;
    fb0 = ld0 > ld1;
    fb1 = fb0 && fb1;
    fb0 = ld2 < fd0;
    for(int i0=0; i0<10; i0++){
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 || fb1;
    fd1 *= -1;
    ab1 = ab2 || ab3;
    Thought lo0 = Thought64.getInstance(ab4, fb0, fb1, ab1);
        boolean lb1 = false;
    double ld2 = 628.9358059045826;
    ld2 *= -1;

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
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    Output.points[0][8] += ad2;
    Output.points[1][0] -= ad3;
    lb1 = fb0 && fb1;
    ad4 *= -1;
    lb0 = !lb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 532.7962351302062;
    double ld1 = 539.489071129896;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought55.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab4 = !fb0;
    Thought lo3 = Thought42.getInstance(fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fd0 *= -1;
    fd1 = ld0 - ld1;
    fb1 = ab1 && ab2;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    ld1 *= -1;

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
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought29.getInstance(ao4, fo0, fo1, ao1);
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fd1 > fd0;
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    fb0 = ad1 > ad2;
    double ld0 = 765.4293497512166;
    fb1 = ad2 < ad3;
    boolean lb1 = true;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought52.getInstance();
    fb0 = !fb1;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ld0 = ao3.m3(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb0 = ld0 > ad1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
    Thought lo3 = Thought2.getInstance(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
    fd1 *= -1;
    double ld4 = 531.4985992200048;
if(fo1 != null){
      fo1.m2(ld0, ld4, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, fb0);
}
    double ld5 = 481.7609565991296;
if(ao4 != null){
      ao3 = ao4.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    ab4 = !fb0;
    fb1 = lb0 || ab1;
        fd1 *= -1;
    Output.points[1][1] += fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return ao4;
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
    ad1 *= -1;
    ab1 = ab2 || ab3;
    ad2 = ad3 + ad4;
    ab4 = fd0 < fd1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    double ld1 = 797.4646363603781;
    ab2 = ab3 || ab4;

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
        fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = !fb1;
    fb0 = !fb1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;

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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[1][2] += fd1;
    Output.points[1][3] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    double ld1 = 403.415098618491;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1);
}
    Output.points[1][4] -= fd0;
    boolean lb2 = true;
    Thought lo3 = Thought65.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
    boolean lb4 = true;
if(fo0 != null){
      ld1 = fo0.m3(lb0, lb2, lb4, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo5 = Thought1.getInstance(fd0, fd1, ld1, fd0, lb2, lb4, fb0, fb1);
    boolean lb6 = false;

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
    fb0 = fd0 < fd1;
    fd0 *= -1;
    Thought lo0 = Thought87.getInstance(fo1, fo0, fo1, fo0);
    Output.points[1][5] -= fd1;
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    lb1 = !lb2;
    fb0 = fb1 && lb1;
    double ld3 = 926.1223692958295;
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
}
