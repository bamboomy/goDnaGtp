package genetic;
import java.util.ArrayList;
class Thought54 extends Thought{
private static ArrayList<Thought54> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 350.7891795891478;
private double fd1 = 893.979843365319;
private Thought fo0 = null;
private Thought fo1 = null;
Thought54 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought54 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought54 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought54 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought54 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
          fo1.m1();
}
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
    fd1 *= -1;
    Output.points[2][1] -= fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 840.9217218288181;
    fb0 = fb1 && ab1;
    double ld1 = 752.9569769997194;
if(fo0 != null){
          fo0.m3(ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
        fb0 = ld1 < fd0;
    fb1 = lb2 || ab1;
    fd1 = ld0 - ld1;

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
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    lb2 = ad1 < ad2;
    Thought lo3 = Thought86.getInstance();
    boolean lb4 = false;
    lb4 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb5 = false;

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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought148.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ab1 = ad4 < fd0;
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    boolean lb2 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    Output.points[2][2] += fd1;
    boolean lb4 = true;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb3, lb4, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !lb1;
    lb2 = lb3 || lb4;
    ab1 = ab2 && ab3;
    double ld5 = 13.829197139856142;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb1, lb2);
}
    lb3 = fd0 > fd1;
    if (lb4) {
        double ld6 = 820.8038095844134;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ld6 = fo0.m3(ld5, ad1, ad2, ad3);
}
        ab1 = ad4 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld6, ld5, ad1, ad2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    Thought lo0 = Thought20.getInstance();
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 *= -1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    Output.points[2][3] += fd0;
    fb1 = fd1 > fd0;
    double ld1 = 381.71544296219173;
    fd0 *= -1;
    fb0 = fd1 < ld1;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;

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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Thought lo1 = Thought5.getInstance(ao2, ao3, ao4, fo0);
        boolean lb2 = false;
if(fo1 != null){
          lb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
        lb2 = fd0 < fd1;
        fb0 = ad1 > ad2;
        fb1 = lb0 && lb2;
        ad3 = ad4 + fd0;
        fd1 = ad1 + ad2;
        double ld3 = 225.19892598604628;
        boolean lb4 = false;
        ad2 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          ao1.m2(ld3, ad1, ad2, ad3, lb4, fb0, fb1, lb0);
}
        lb2 = lb4 || fb0;
        Output.points[2][4] -= ad4;
        boolean lb5 = true;
        fb0 = fb1 && lb0;
        boolean lb6 = false;
        fd0 *= -1;
        Thought lo7 = Thought208.getInstance(ao2, ao3, ao4, fo0, lb2, lb4, lb5, lb6);
        boolean lb8 = false;
        boolean lb9 = false;
        lb8 = fd1 < ld3;
        Output.points[2][5] -= ad1;
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
        fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
    double ld0 = 986.6956187776959;
    double ld1 = 10.991134120200876;
if(ao2 != null){
      ld1 = ao2.m3();
}
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        Thought lo2 = Thought54.getInstance(ab1, ab2, ab3, ab4);
        Output.points[2][6] -= fd0;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
        boolean lb3 = true;
        double ld4 = 266.3777527702932;
        Output.points[2][7] -= fd0;
if(ao1 != null){
          fd1 = ao1.m3(ld4, ld0, ld1, fd0);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, ld4, ld0, ld1);
}
        boolean lb5 = false;
        Thought lo6 = Thought231.getInstance(fd0, fd1, ld4, ld0, ab4, fb0, fb1, lb3);
        Thought lo7 = Thought164.getInstance(ao1, ao2, ao3, ao4, lb5, ab1, ab2, ab3);
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb8 = true;
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
    ab2 = !ab3;
    Output.points[2][8] += ad4;
    fd0 *= -1;
    boolean lb0 = true;
    ab3 = ab4 || fb0;
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    fb0 = fb1 && lb0;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    lb1 = ad3 > ad4;
    double ld2 = 249.66610345765025;
    ab1 = ad4 < fd0;
    ab2 = ab3 || ab4;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd1, ld2, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    double ld0 = 288.869734313111;
    Output.points[3][0] -= fd0;
    double ld1 = 749.7747482118799;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
    Thought lo2 = Thought189.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ld1 *= -1;

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
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(ab1, ab2, ab3, ab4);
}
    Output.points[3][1] -= fd0;
    if (fb0) {
        fb1 = fd1 < fd0;
        fd1 *= -1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        boolean lb1 = true;
        Output.points[3][2] += fd0;
        fd1 = fd0 + fd1;
        boolean lb2 = true;
        double ld3 = 149.34835553034816;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          lb1 = fo0.m2(ld3, fd0, fd1, ld3);
}
}
Thought.STACK_COUNTER++;
return ab1;
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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    lb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = ad3 > ad4;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1();
}
    boolean lb2 = false;
    lb2 = fb0 && fb1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, lb2);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    Thought lo1 = Thought215.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    Output.points[3][3] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[3][4] += ad4;
    fd0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
    ab1 = ab2 && ab3;
    ab4 = ad4 < fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought187.getInstance(ao2, ao3, ao4, fo0);
    Thought lo2 = Thought397.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    double ld3 = 788.7053645681056;
    Thought lo4 = Thought103.getInstance(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3);
    fb1 = lb0 || fb0;
if(ao4 != null){
      ao4.m3(fd0, fd1, ld3, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
    fd1 = ld3 + fd0;
    Output.points[3][5] -= fd1;
    boolean lb5 = false;
    boolean lb6 = false;
    lb5 = ld3 > fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb7 = false;
    Thought lo8 = Thought92.getInstance(fo1, ao1, ao2, ao3, fd1, ld3, fd0, fd1, lb6, lb7, fb0, fb1);
    ld3 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb5, lb6, lb7);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = ld3 < fd0;
    fb1 = lb0 || lb5;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld3, fd0, fd1);
}
    boolean lb9 = false;

Thought.STACK_COUNTER++;
return lb6;
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
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought14.getInstance();
    lb0 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
        ab1 = ab2 && ab3;
        Thought lo2 = Thought305.getInstance(ab4, fb0, fb1, lb0);
        double ld3 = 716.248130211912;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m3(ld3, fd0, fd1, ld3);
}
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
}
        fd1 *= -1;
if(fo1 != null){
          ab2 = fo1.m2(ld3, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 && ab2;
        ab3 = fd0 > fd1;
        ab4 = ld3 > fd0;
        boolean lb4 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb4);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 *= -1;
        lb0 = ld3 < fd0;
        ab1 = !ab2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ad1 < ad2;
    boolean lb1 = false;
    ab1 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb2 = true;
    Output.points[3][6] += ad3;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ad1);
}
    ab2 = ab3 || ab4;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao3.m1(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = lb2 && lb3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
if(fo0 != null){
      ao4 = fo0.m4();
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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
        Output.points[3][7] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 + fd1;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
        Output.points[3][8] -= fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
            boolean lb0 = true;
            fd0 = fd1 + fd0;
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
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 374.6622126919056;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ld0 < fd0;
    ab4 = fd1 > ld0;
    fd0 *= -1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo0.m1();
}
    boolean lb1 = true;
    double ld2 = 958.1276869405319;
    ab1 = fd0 > fd1;
    ld0 = ld2 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(lb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ld0;

Thought.STACK_COUNTER++;
return ld2;
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
    ad1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad3 > ad4;
    fb1 = lb0 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        Output.points[4][0] -= ad2;
        lb0 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
        ad1 = ad2 + ad3;
        }
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    double ld1 = 650.5933878270513;

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
    ad1 *= -1;
    double ld0 = 734.5421186513562;
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    Output.points[4][1] += ad2;
    boolean lb1 = false;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    double ld3 = 821.9545667646091;

Thought.STACK_COUNTER++;
return ld0;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Output.points[4][2] += fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    boolean lb1 = true;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
    fb0 = !fb1;
    lb0 = !lb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought325.getInstance(fd1, fd0, fd1, fd0);
    boolean lb4 = false;
        Output.points[4][3] -= fd1;
    boolean lb5 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, lb2, lb4, lb5, fb0);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, lb2);
}
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb4, lb5, fb0, fb1);
}
    lb0 = lb1 && lb2;
    Thought lo6 = Thought241.getInstance(lb4, lb5, fb0, fb1);

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
    double ld0 = 863.0476992487506;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought187.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ld0;
    Thought lo2 = Thought264.getInstance();
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    Thought lo3 = Thought2.getInstance(ao2, ao3, ao4, fo0);
    Output.points[4][4] += ld0;
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
    Thought lo4 = Thought325.getInstance(ad4, fd0, fd1, ld0);
    boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld0;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, lb5, fb0, fb1);
}
    double ld6 = 724.5252624509989;
    ad4 = fd0 - fd1;
    boolean lb7 = false;
    lb5 = lb7 && fb0;

Thought.STACK_COUNTER++;
return ld0;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 + fd1;
    ab3 = !ab4;
    Thought lo0 = Thought272.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[4][5] -= fd0;
    double ld2 = 584.8577713885558;
    fb0 = fd0 < fd1;
if(ao3 != null){
      fb1 = ao3.m2();
}
    lb1 = ab1 || ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
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
    ad1 = ad2 - ad3;
    Output.points[4][6] += ad4;
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    Thought lo0 = Thought40.getInstance(ao4, fo0, fo1, ao1);
    Thought lo1 = Thought47.getInstance(ad3, ad4, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        Output.points[4][7] += fd0;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought41.getInstance();
        fb0 = fd1 < ad1;
        fb1 = ab1 || ab2;
        ab3 = ab4 && fb0;
        boolean lb3 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb3, ab1);
}
        Output.points[4][8] += fd1;
        double ld4 = 844.1307086508242;
        ab2 = ld4 > ad1;
        Output.points[5][0] += ad2;
        Thought lo5 = Thought257.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
        boolean lb6 = true;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (fb0) {
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
        Output.points[5][1] -= fd0;
        fb0 = fb1 && lb0;
        Output.points[5][2] += fd1;
        fb0 = fd0 > fd1;
        fb1 = fd0 < fd1;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    ab2 = fd1 < fd0;
    Thought lo1 = Thought156.getInstance(ab3, ab4, fb0, fb1);
    lb0 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    if (lb2) {
        Output.points[5][3] += fd1;
        fd0 = fd1 + fd0;
        ab1 = fd1 < fd0;
        ab2 = !ab3;
        fd1 = fd0 + fd1;
        fd0 *= -1;
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
    Output.points[5][4] -= ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 && fb1;
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        fb0 = ad4 > fd0;
        if (fb1) {
            Thought lo0 = Thought40.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1);
}
            fd1 *= -1;
            } else if (fb0) {
            ad1 = ad2 + ad3;
            fb1 = fb0 && fb1;
if(fo1 != null){
              fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
            boolean lb1 = true;
if(fo0 != null){
              ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
            Thought lo2 = Thought36.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
            boolean lb3 = false;
            fb0 = fd0 > fd1;
            for(int i1=0; i1<10; i1++){
if(fo0 != null){
                  fb1 = fo0.m2();
}
                ad1 = ad2 - ad3;
                Thought lo4 = Thought352.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, lb3, fb0, fb1);
}}}
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
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 - ad4;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    double ld0 = 410.6681847284005;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    fb0 = fb1 && ab1;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought34.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
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
    fb0 = fb1 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    double ld0 = 128.17807774121133;
    for(int i0=0; i0<10; i0++){
        ld0 *= -1;
        for(int i1=0; i1<10; i1++){
            fd0 *= -1;
            double ld1 = 944.473159722097;
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, ld1, ld0);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld0);
}
if(ao3 != null){
              fb0 = ao3.m2(fd0, fd1, ld1, ld0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
            fb1 = fb0 || fb1;
if(ao4 != null){
              ao3 = ao4.m4();
}
if(fo0 != null){
              fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld0, fb1, fb0, fb1, fb0);
}
            }
if(ao4 != null){
          ao4.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb1 = fd1 > ld0;
        boolean lb2 = true;
        fd0 = fd1 - ld0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    fb1 = ad2 > ad3;
    Output.points[5][5] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb0 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    Output.points[5][6] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought158.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
        lb0 = ab1 || ab2;
    Output.points[5][7] -= fd1;
        ab3 = fd0 < fd1;
    Thought lo1 = Thought358.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    Thought lo3 = Thought334.getInstance(ao2, ao3, ao4, fo0, lb0, lb2, ab1, ab2);
    ab3 = ab4 || fb0;
    Thought lo4 = Thought332.getInstance();
    Thought lo5 = Thought13.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, lb2, ab1);
if(ao4 != null){
      ao4.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb7 = true;
    double ld8 = 678.2030678974247;
    boolean lb9 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    Output.points[5][8] += ad3;
    lb0 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
        ab3 = !ab4;
        ad4 *= -1;
        fd0 = fd1 - ad1;
        Output.points[6][0] -= ad2;
        boolean lb1 = true;
        boolean lb2 = false;
        }
if(ao3 != null){
      fb0 = ao3.m2(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 553.1554875123898;
    fb1 = fb0 || fb1;
    ld0 *= -1;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
        boolean lb1 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = lb1 && lb2;
    fb0 = fd1 < fd0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
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
}
