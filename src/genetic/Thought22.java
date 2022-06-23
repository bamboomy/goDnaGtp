package genetic;
import java.util.ArrayList;
class Thought22 extends Thought{
private static ArrayList<Thought22> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 221.30985625278478;
private double fd1 = 528.0421247881417;
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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Output.points[8][7] -= fd0;
    if (fb1) {
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(fo0 != null){
          fo0.m1();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - fd0;
        Output.points[8][8] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = fd0 < fd1;
        Thought lo0 = Thought84.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
        boolean lb1 = true;
        Thought lo2 = Thought54.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
        for(int i0=0; i0<10; i0++){
            fd0 *= -1;
            Thought lo3 = Thought14.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
            fb1 = fd1 < fd0;
            fd1 *= -1;
            Thought lo4 = Thought40.getInstance(lb1, fb0, fb1, lb1);
            fb0 = fb1 && lb1;
if(fo0 != null){
              fo0.m3();
}
            boolean lb5 = true;
            double ld6 = 701.7808465663086;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[0][0] -= fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 160.10998207696858;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ld0 = fd0 - fd1;
    fb0 = !fb1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    Output.points[0][1] += fd0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Thought lo4 = Thought15.getInstance(lb2, lb3, ab1, ab2);
    ab3 = fd0 < fd1;
    double ld5 = 23.48607854662768;

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
    Thought lo0 = Thought29.getInstance();
    boolean lb1 = true;
    ad1 *= -1;
    lb1 = !fb0;
    double ld2 = 556.6850802518998;
    double ld3 = 428.72028371612464;
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    lb1 = ad4 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ld3, ad1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    Thought lo4 = Thought49.getInstance(ad2, ad3, ad4, fd0);
    boolean lb5 = true;
    fd1 = ld2 + ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fd0 = fo0.m3(lb5, fb0, fb1, lb1);
}
    lb5 = fd1 > ld2;
    boolean lb6 = false;
    boolean lb7 = true;
    Output.points[0][2] += ld3;
    double ld8 = 410.206164972559;
if(fo1 != null){
      ld8 = fo1.m3();
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, lb6, lb7, fb0, fb1);
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
    ad2 *= -1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 || ab3;
    double ld0 = 284.0055915019616;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought48.getInstance(ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
    Output.points[0][3] += ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
    ab3 = !ab4;
    fb0 = fb1 && lb2;
    ld0 = ad1 - ad2;

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
    fd1 = fd0 - fd1;
    double ld0 = 545.3682949964234;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fd0 *= -1;
        fb0 = !fb1;
if(fo1 != null){
          fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
        fb0 = fd0 < fd1;
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
    boolean lb0 = true;
    ad1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > ad1;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[0][4] -= ad2;
    lb1 = fb0 && fb1;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
    fd1 = ad1 - ad2;
    double ld2 = 496.69420375091534;

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
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 *= -1;
    lb1 = ab1 || ab2;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    lb0 = lb1 && ab1;
    ab2 = fd0 > fd1;
    ab3 = !ab4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao2.m2(lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4();
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
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        }
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought60.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
    fb0 = ad2 < ad3;
    for(int i1=0; i1<10; i1++){
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
        boolean lb1 = true;
        fb0 = ad2 > ad3;
        fb1 = ad4 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        boolean lb2 = true;
        ad4 = fd0 + fd1;
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
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        double ld0 = 393.11313006429214;
        ld0 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
        fb1 = fd0 > fd1;
        ld0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        fb0 = !fb1;
        fd1 = ld0 + fd0;
        boolean lb2 = true;
        boolean lb3 = false;
        lb1 = fd1 > ld0;
        lb2 = lb3 || fb0;
        fd0 = fd1 + ld0;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = !ab4;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought88.getInstance(ab2, ab3, ab4, fb0);
    fb1 = lb0 || ab1;
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    fd0 = fd1 + fd0;
    double ld2 = 89.98898198288714;

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
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    lb0 = fb0 && fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = ad1 + ad2;
    lb0 = fb0 && fb1;
    ad3 = ad4 - fd0;
    Output.points[0][5] += fd1;
        boolean lb1 = false;
if(fo1 != null){
      lb0 = fo1.m2(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = lb1 && fb0;
    Output.points[0][6] -= fd0;
    fb1 = !lb0;
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
        if (fb1) {
            fd1 *= -1;
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ad4 = fd0 - fd1;
    if (ab2) {
        ad1 *= -1;
if(fo1 != null){
          fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        boolean lb0 = true;
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        double ld1 = 157.21387488237824;
if(fo1 != null){
          ab4 = fo1.m2(ad3, ad4, fd0, fd1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][7] += fd0;
    fb1 = !fb0;
    fd1 *= -1;
    fd0 *= -1;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    double ld1 = 832.4302809685124;
    ld1 = fd0 + fd1;
if(ao1 != null){
      ld1 = ao1.m3();
}
    double ld2 = 963.6253926121901;
    ld2 = fd0 + fd1;
if(ao2 != null){
      lb0 = ao2.m2(ld1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ld1 = ld2 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = !lb0;
    boolean lb3 = false;
    ld2 = fd0 - fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 213.60166972011152;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought65.getInstance(ad4, fd0, fd1, ld0);
    boolean lb2 = false;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    lb2 = fb0 || fb1;
    ld0 = ad1 + ad2;
if(fo0 != null){
      lb2 = fo0.m2(fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = ad3 > ad4;
    double ld3 = 443.08366920616777;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab1 = ab2 && ab3;
    Output.points[0][8] -= fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought18.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - fd0;
        boolean lb1 = false;
        fd1 = fd0 - fd1;
        fb0 = fb1 && lb1;
        if (ab1) {
            double ld2 = 668.7197928069058;
if(fo0 != null){
              ld2 = fo0.m3(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
              fo0.m2(ab2, ab3, ab4, fb0);
}
            ld2 = fd0 - fd1;
            } else if (fb1) {
            for(int i1=0; i1<10; i1++){
if(ao1 != null){
                  fo1 = ao1.m4();
}
}}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
          ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
        ab3 = !ab4;
        }
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought82.getInstance(ad3, ad4, fd0, fd1);
    ab2 = ad1 < ad2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld2 = 778.7922588200873;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb4 = true;
    ab2 = !ab3;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ad1, ab4, fb0, fb1, lb0);
}
    ad2 *= -1;
    Thought lo5 = Thought90.getInstance(fo0, fo1, ao1, ao2, lb3, lb4, ab1, ab2);
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld2);
}
    ab3 = ad1 > ad2;

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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
        fb0 = !fb1;
    lb0 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought46.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;

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
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 652.64517965013;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 - fd0;
    double ld1 = 595.0562899310454;
    fd0 = fd1 - ld0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
        ld1 = fd0 - fd1;
if(fo0 != null){
          ab3 = fo0.m2(ld0, ld1, fd0, fd1);
}
        ab4 = ld0 > ld1;
        for(int i1=0; i1<10; i1++){
            fd0 = fd1 + ld0;
            boolean lb3 = false;
            ab4 = !fb0;
            fb1 = ld1 > fd0;
            lb3 = ab1 && ab2;
            fd1 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
}}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb1 = lb0 && fb0;
    boolean lb1 = false;
    Thought lo2 = Thought81.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    if (fb0) {
        fd0 = fd1 - ad1;
        boolean lb3 = true;
        fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        Output.points[1][0] -= ad1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought23.getInstance(ab4, fb0, fb1, ab1);
    double ld1 = 961.6130255331485;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    fb0 = !fb1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought13.getInstance(ad4, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld1;
    ad1 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        double ld0 = 210.34732356835818;
if(ao1 != null){
          fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        boolean lb2 = true;
        fd0 = fd1 - ld0;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
        double ld3 = 584.8943832262374;
        lb1 = ld3 < fd0;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld3, fd0, lb2, fb0, fb1, lb1);
}
        fd1 *= -1;
        for(int i1=0; i1<10; i1++){
            }
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][1] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, fb0, fb1);
}
    lb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 + ad3;
    fb0 = fb1 && lb0;
    ad4 *= -1;
    Thought lo1 = Thought62.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[1][2] -= ad3;
    ad4 *= -1;

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
    fd1 *= -1;
    double ld0 = 207.7326608545195;
    ld0 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
        ab3 = fd1 < ld0;
    double ld1 = 422.11605694792433;
if(ao1 != null){
      ao1.m1(ab4, fb0, fb1, ab1);
}
    double ld2 = 916.9260231535523;
    boolean lb3 = false;
if(ao2 != null){
      ld1 = ao2.m3();
}
    ld2 = fd0 + fd1;
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld1, ld2, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ab1 = !ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ld2, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought11.getInstance(ao4, fo0, fo1, ao1, lb3, ab1, ab2, ab3);
    fd0 = fd1 + ld0;
    ab4 = ld1 > ld2;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ld1, ld2);
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
    double ld0 = 432.4078719893673;
    ab2 = ld0 < ad1;
    ab3 = ab4 && fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, ab1, ab2, ab3);
}
    Output.points[1][3] -= fd1;
    ld0 *= -1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m2();
}
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    double ld2 = 70.62844958261;
if(ao3 != null){
      fb1 = ao3.m2(ld0, ld2, ad1, ad2, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = lb1 && ab1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb1, ab1, ab2);
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
    boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
    double ld1 = 798.0705638763975;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
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
    double ld0 = 492.7629858707371;
    ab2 = ab3 && ab4;
    fb0 = ld0 > fd0;
    Output.points[1][4] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 || ab2;
    double ld1 = 556.0787357774195;
    ab3 = ld0 < ld1;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ld1 < fd0;
    ab3 = fd1 > ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, fd0);
}
    Thought lo2 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        fb1 = fd1 < ld0;
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought95.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = true;
    ad1 = ad2 - ad3;
    Output.points[1][5] += ad4;
    fd0 = fd1 - ad1;
    lb2 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
    Output.points[1][6] += ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
    boolean lb3 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(lb0, lb2, lb3, fb0);
}
    boolean lb4 = true;
    boolean lb5 = true;
    fd1 *= -1;
    ad1 *= -1;
    boolean lb6 = false;
if(fo0 != null){
      lb5 = fo0.m2();
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
    boolean lb0 = false;
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    Output.points[1][7] -= ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Output.points[1][8] -= ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
    double ld3 = 835.557391966581;
    if (lb0) {
        Output.points[2][0] -= fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld3, ad1, ad2);
}
        if (lb1) {
if(fo0 != null){
              fo1 = fo0.m4(lb2, ab1, ab2, ab3);
}
            ab4 = ad3 < ad4;
            double ld4 = 416.8702636911853;
            ad4 = fd0 - fd1;
            Thought lo5 = Thought82.getInstance();
            fb0 = fb1 && lb0;
            lb1 = !lb2;
if(fo1 != null){
              ld4 = fo1.m3(ld3, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0);
}
}}
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
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought60.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    lb0 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo2 = Thought28.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[2][1] += fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[2][2] += fd1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao4 != null){
      ao4.m2();
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    Output.points[2][3] += ad3;
        fb1 = ad4 < fd0;
    lb0 = fd1 > ad1;
    fb0 = fb1 && lb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[2][4] += fd1;
    double ld0 = 353.052120970221;
    fb1 = !ab1;
        Output.points[2][5] -= ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    double ld2 = 146.256956364561;
if(ao2 != null){
      ao1 = ao2.m4(ld2, fd0, fd1, ld0);
}
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0);
}
    boolean lb4 = false;
    ab3 = !ab4;
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb1);
}
    ld2 = fd0 + fd1;
    ld0 = ld2 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = ad1 < ad2;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought61.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    Thought lo2 = Thought74.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    fb0 = fb1 || lb0;
    ad1 *= -1;
    ab1 = ad2 < ad3;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    Output.points[2][6] -= ad2;
    Thought lo3 = Thought7.getInstance(ao3, ao4, fo0, fo1);
    boolean lb4 = true;
    ab4 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb4);
}
    boolean lb5 = true;
    lb5 = !ab1;
    boolean lb6 = true;
    double ld7 = 735.0048726896654;

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
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    Output.points[2][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[2][8] -= fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[3][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    Output.points[3][1] -= fd1;
    lb0 = !fb0;
    fd0 = fd1 - fd0;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought68.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[3][2] += fd1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
    boolean lb1 = true;
    lb0 = fd0 < fd1;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
    double ld2 = 535.6108276484331;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    Thought lo3 = Thought60.getInstance(fd0, fd1, ld2, fd0);
    fb1 = lb0 || lb1;
    fd1 = ld2 + fd0;
        fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
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
