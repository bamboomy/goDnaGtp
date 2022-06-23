package genetic;
import java.util.ArrayList;
class Thought22 extends Thought{
private static ArrayList<Thought22> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 369.57427874570476;
private double fd1 = 551.826883286721;
private Thought fo0 = null;
private Thought fo1 = null;
Thought22 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought22 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought22 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought22 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought22 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought22 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought22 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought22 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought22 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo0 = Thought38.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo1 = Thought31.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    double ld2 = 324.8457095501175;
    fd0 = fd1 + ld2;
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    boolean lb3 = false;
    boolean lb4 = true;
    lb4 = ld2 < fd0;
    double ld5 = 175.54461517370314;
    fb0 = fb1 || lb3;

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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought66.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    ab4 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought32.getInstance();
if(fo0 != null){
      ab3 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Output.points[0][0] -= fd1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought97.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    boolean lb3 = false;
    Thought lo4 = Thought42.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
    boolean lb5 = true;
    boolean lb6 = false;
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1);
}
        lb6 = ab1 && ab2;
    boolean lb7 = false;
    Thought lo8 = Thought91.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    boolean lb9 = false;
    Thought lo10 = Thought31.getInstance();
    fb0 = fb1 && lb3;

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
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    double ld1 = 774.3007476273057;
    double ld2 = 918.9596095981695;
    boolean lb3 = true;
    boolean lb4 = true;
    Output.points[0][1] += ad3;
    Output.points[0][2] -= ad4;
    lb0 = !lb3;
if(fo1 != null){
      fo1.m2(lb4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
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
    Thought lo0 = Thought95.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = ab1 && ab2;
        ad1 = ad2 - ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
        ad1 = ad2 + ad3;
        ab4 = fb0 && fb1;
        boolean lb1 = true;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab3 = ad4 < fd0;
        ab4 = fd1 < ad1;
        ad2 = ad3 - ad4;
        fb0 = fb1 && lb1;
        lb2 = !ab1;
if(fo0 != null){
          fo0.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        fb1 = ad3 < ad4;
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
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    Thought lo1 = Thought39.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    Thought lo2 = Thought57.getInstance(lb0, fb0, fb1, lb0);
    fd0 *= -1;
    fb0 = fb1 || lb0;
    boolean lb3 = true;
    double ld4 = 320.56374730491046;
    Thought lo5 = Thought87.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld4, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld4, fd0, fd1, lb3, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
}
    lb3 = ld4 > fd0;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = !lb0;

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
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    boolean lb0 = false;
    Thought lo1 = Thought36.getInstance(fd0, fd1, ad1, ad2);
    lb0 = ad3 < ad4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    Output.points[0][3] += fd0;
    fb1 = fd1 < ad1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    if (fb0) {
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        fb0 = ad4 < fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
        Thought lo2 = Thought39.getInstance(ao3, ao4, fo0, fo1);
        } else if (lb0) {
        fd1 *= -1;
        fb0 = ad1 > ad2;
        fb1 = lb0 && fb0;
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
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 290.1509469924588;
    fb1 = ab1 || ab2;
    boolean lb1 = true;
    ab2 = ld0 > fd0;
    if (ab3) {
        fd1 = ld0 + fd0;
if(ao4 != null){
          ao3 = ao4.m4();
}
        ab4 = fb0 || fb1;
        lb1 = ab1 || ab2;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
        Output.points[0][4] += ld0;
        Output.points[0][5] += fd0;
        Output.points[0][6] -= fd1;
        ld0 = fd0 + fd1;
        ld0 = fd0 - fd1;
if(ao1 != null){
          ao1.m3(ab3, ab4, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][7] -= ad1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    Thought lo0 = Thought89.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
    ad1 = ad2 + ad3;
    Thought lo1 = Thought9.getInstance(fo0, fo1, ao1, ao2);
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    ab3 = ad1 < ad2;
    ab4 = fb0 || fb1;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
    Output.points[0][8] -= ad4;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fb1 = lb2 && ab1;
    Thought lo3 = Thought85.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo4 = Thought37.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, lb2, ab1, ab2);
    boolean lb5 = true;
    ab2 = ad2 > ad3;

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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    double ld0 = 428.41637802219816;
    fd0 = fd1 - ld0;
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = ld0 > fd0;
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
    fb1 = lb1 || fb0;
    fb1 = lb1 && fb0;
if(fo1 != null){
      fo1.m3(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    Output.points[1][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought18.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
    lb1 = !fb0;
    boolean lb3 = false;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    double ld1 = 630.591890874545;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    double ld2 = 348.93702714622253;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(lb0, ab1, ab2, ab3);
}
    Thought lo3 = Thought90.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
    boolean lb4 = false;
    Thought lo5 = Thought76.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
    lb0 = ld1 > ld2;
    fd0 = fd1 - ld1;

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
    fb0 = !fb1;
    ad2 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    Thought lo0 = Thought94.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd1 < ad1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought98.getInstance();
    fd1 = ad1 - ad2;
    Thought lo2 = Thought56.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    lb3 = !fb0;
    fb1 = lb3 || fb0;

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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought49.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    ab2 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
    ab3 = !ab4;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 > fd1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 *= -1;
    Thought lo1 = Thought81.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb2, fb0, fb1);
}
    lb0 = !lb2;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld3 = 776.5560742534957;
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld3, fd0, lb0, lb2, fb0, fb1);
}
    boolean lb4 = false;
    Thought lo5 = Thought25.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld3, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(lb0, lb2, lb4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    ad4 *= -1;
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought72.getInstance(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought78.getInstance();
    Thought lo3 = Thought20.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
if(ao4 != null){
      ao4.m3(lb0, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    Thought lo4 = Thought79.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    fd0 *= -1;

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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[1][1] -= fd1;
    fb1 = !ab1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought76.getInstance(fo0, fo1, ao1, ao2);
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb2 = ab1 || ab2;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb5 = true;
    double ld6 = 731.9422336004211;
    double ld7 = 710.0218651733724;
if(ao3 != null){
      ld6 = ao3.m3(ao4, fo0, fo1, ao1, ld7, fd0, fd1, ld6);
}
    ld7 = fd0 - fd1;
    boolean lb8 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought12.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought2.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    ad4 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      ab4 = ao1.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb2, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb2;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought26.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > fd0;

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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][2] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought35.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fb0 = fd1 < ad1;
        fb1 = !lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] -= ad1;
    boolean lb0 = true;
    double ld1 = 923.7543518661918;
    lb0 = ad1 > ad2;
    ad3 *= -1;
if(fo1 != null){
      ab1 = fo1.m2();
}
    ad4 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        double ld3 = 81.5606770086853;
        lb0 = !lb2;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        ab1 = !ab2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld3, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    Output.points[1][4] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = fd1 < fd0;
    boolean lb2 = false;
    boolean lb3 = false;
    Thought lo4 = Thought78.getInstance(lb1, lb2, lb3, fb0);

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
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
    Output.points[1][5] -= ad3;
    Thought lo0 = Thought49.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = ad2 < ad3;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    ad2 *= -1;
    boolean lb2 = true;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb1, lb2, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ab1 = fd1 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
    Thought lo0 = Thought37.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    fd0 *= -1;
    double ld1 = 561.8766859987742;
    Thought lo2 = Thought54.getInstance();
    fd0 = fd1 + ld1;
    Output.points[1][6] += fd0;
    Output.points[1][7] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ld1;
    boolean lb3 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ld1;
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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        fb0 = ad2 < ad3;
if(ao1 != null){
          ao1.m3(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
        ad2 *= -1;
if(ao2 != null){
          ao2.m1();
}
        ad3 = ad4 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
        fb1 = fd0 < fd1;
        ad1 = ad2 + ad3;
if(fo0 != null){
          ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
        fb1 = ad4 > fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
        Output.points[1][8] -= ad4;
        ab1 = ab2 || ab3;
        ab4 = fd0 > fd1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
        boolean lb0 = true;
        fd0 = fd1 - ad1;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3);
}
}
Thought.STACK_COUNTER++;
return ad2;
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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought14.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought86.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought74.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    double ld3 = 546.5354714222927;
    Output.points[2][0] -= fd0;
    fd1 = ld3 + fd0;
    fb0 = fd1 < ld3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld3;

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
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought40.getInstance(fb1, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 || ab1;
    ab2 = fd1 > fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    double ld1 = 504.0215614056574;
    ab2 = fd0 > fd1;
    double ld2 = 300.2244007378015;
    ld1 = ld2 + fd0;
    double ld3 = 265.4314885017148;
    fd0 = fd1 + ld1;
    ab3 = ld2 < ld3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;

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
    boolean lb0 = true;
    lb0 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    double ld1 = 385.7734352959785;
    Thought lo2 = Thought77.getInstance();
    lb0 = fb0 || fb1;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ld1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    ad1 = ad2 - ad3;
    lb0 = !fb0;

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
    Thought lo0 = Thought15.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ad1 > ad2;
    double ld1 = 487.2378238395974;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb2 = fd1 > ld1;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ld1;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !lb2;
    ab1 = ad1 > ad2;
    ad3 *= -1;
    Thought lo3 = Thought28.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought40.getInstance(fd1, fd0, fd1, fd0);
    double ld2 = 222.3775819816329;
    fb0 = fd0 < fd1;
if(ao2 != null){
      fb1 = ao2.m2(lb0, fb0, fb1, lb0);
}
    fb0 = ld2 < fd0;
    fd1 = ld2 + fd0;
    boolean lb3 = true;
    double ld4 = 203.34407032798677;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld4);
}
    for(int i0=0; i0<10; i0++){
        lb3 = fb0 || fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld4, lb0, lb3, fb0, fb1);
}
        Output.points[2][1] += fd0;
        lb0 = lb3 || fb0;
        fd1 *= -1;
        double ld5 = 590.532385242745;
        Thought lo6 = Thought58.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, lb3, fb0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ld5 = fo1.m3(ld2, ld4, fd0, fd1, fb1, lb0, lb3, fb0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    boolean lb0 = false;
    Output.points[2][2] -= fd1;
    Thought lo1 = Thought0.getInstance();
    Output.points[2][3] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Output.points[2][4] -= ad3;
    lb0 = !fb0;
    Output.points[2][5] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought41.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
    double ld3 = 115.91257581006329;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    double ld4 = 525.6539944586035;
    ad3 = ad4 + fd0;
    double ld5 = 2.671109688348073;
    fd0 = fd1 + ld3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld4 = ld5 - ad1;
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao3.m1();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought21.getInstance(ab4, fb0, fb1, ab1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought64.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Thought lo2 = Thought53.getInstance(fo1, ao1, ao2, ao3);
    fd0 *= -1;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;

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
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
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
    fb0 = fd0 > fd1;
    Output.points[2][6] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought96.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 792.4013924980645;
    Output.points[2][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    double ld0 = 107.93472310803823;
    fd0 = fd1 + ld0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    fb0 = fd1 > ld0;
    Output.points[2][8] += fd0;
    Thought lo1 = Thought48.getInstance(fd1, ld0, fd0, fd1);
    Output.points[3][0] -= ld0;
    Output.points[3][1] += fd0;
    fb1 = fd1 < ld0;
    fb0 = fd0 < fd1;
    double ld2 = 164.7024173637366;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    fb0 = ld2 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Output.points[3][2] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought52.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
            fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
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
}
